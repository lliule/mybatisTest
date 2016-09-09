package com.weichaishi.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weichaishi.dao.LabacProjectsMapper;
import com.weichaishi.dao.ProjectsTasksViewMapper;
import com.weichaishi.model.LabacProjects;
import com.weichaishi.model.ProjectsTasksView;
import com.weichaishi.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LabacProjectsService extends BaseService<LabacProjects,Integer> {

    @Autowired
    private LabacProjectsMapper labacProjectsMapper;

    @Autowired
    private ProjectsTasksViewMapper projectsTasksViewMapper;

    @Override
    public Integer updateBySelective(LabacProjects entity) {
        entity.setProjectUpdateTime(new Date());
        return super.updateBySelective(entity);
    }

    public Map<String, Object> insertOne(LabacProjects entity) {
        Map<String,Object> map = new HashMap<String, Object>();
        entity.setProjectCreateTime(new Date());
        entity.setProjectUpdateTime(entity.getProjectCreateTime());
        Integer count = labacProjectsMapper.insertOne(entity);
        if(count == 0 ){
            return null;
        }
        map.put("projectId",entity.getProjectId());
        return map;
    }


    public PageResult selectProjectAndTasks(Integer pageNum,Integer paegSize){
        PageHelper.startPage(pageNum,paegSize);
        List<LabacProjects> labacProjectses = labacProjectsMapper.selectProjectAndTasks();
        PageInfo<LabacProjects> info = new PageInfo<LabacProjects>(labacProjectses);
        PageResult result = new PageResult();
        result.setData(info.getList());
        result.setPageNum(info.getPageNum());
        result.setPageSize(info.getPageSize());
        result.setTotalCount(info.getTotal());
        return result;
    }

    /**
     * �洢���̼�ʾ��
     * map�� ������projectId  map��key ����Ҫ��xml�е�propertyֵһ��
     *
     * ������洢���̺�map�оͻ����xml�ж���õ���property ��ֵΪ�ˣ�����洢���̷��ص�ֵΪvalue��map��
     * @param projectId
     * @return
     */
    public Object selectDemo(Integer projectId){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("projectId",projectId);
        labacProjectsMapper.selectDemo(map);
        Object id = map.get("id");
        return  id;
    }


    /**
     * ��ͼ�ļ�ʾ��
     * @return
     */
    public List<ProjectsTasksView> selectView(){
        List<ProjectsTasksView> list = labacProjectsMapper.selectView();
        doTaskLocGeoForList(list);
        return list;
    }

    /**
     * ���� taskLocGeo �ֶ�
     *��� ���ֶβ��ܱ�json���� �����ֶβ��Ϊ����ֶ�
     * @param projectsTasksView
     */
    private void doTaskLocGeo(ProjectsTasksView projectsTasksView){
        if(projectsTasksView != null) {

            Struct locGeo = (Struct) projectsTasksView.getTaskLocGeo();
            try {
                if(locGeo != null){

                    Object[] objects = locGeo.getAttributes();
                    projectsTasksView.setTaskSdoGtype(objects[0]);
                    projectsTasksView.setTaskSdosrid(objects[1]);
                    if(objects[2] != null){
                        Struct object = (Struct) objects[2];
                        Object[] attributes = object.getAttributes();

                        projectsTasksView.setTaskSdoPointX((BigDecimal)attributes[0]);
                        projectsTasksView.setTaskSdoPointY((BigDecimal)attributes[1]);
                        projectsTasksView.setTaskSdoPointZ((BigDecimal)attributes[2]);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * ��������taskLocGeo�ֶ�
     * @param list
     */
    private void doTaskLocGeoForList(List<ProjectsTasksView> list){
        if(list != null && !list.isEmpty()) {
            for (ProjectsTasksView projectsTasksView : list) {
                doTaskLocGeo(projectsTasksView);
            }
        }
    }

    /**
     * ��ѯ��ͼ
     * @param projectsTasksView
     * @return
     */
    public List<ProjectsTasksView> selectViewByProjectId(ProjectsTasksView projectsTasksView){
        List<ProjectsTasksView> list = projectsTasksViewMapper.select(projectsTasksView);
        doTaskLocGeoForList(list);
        return  list;
    }

    /**
     * ��ѯ��ͼ�Ĳ����ֶ�
     * @return
     */
    public List<Map<String,Object>> selectViewPort(){
        return labacProjectsMapper.selectViewPart();
    }

    /**
     *ʹ��map��װ��ѯ�ı�Ĳ����ֶ�
     * @param projectId
     * @return
     */
    public List<Map<String,Object>> selectMap(Integer projectId){
        return labacProjectsMapper.selectMap(projectId);
    }

    /**
     * ���ô洢���̣�����projectId��ѯprojectDesc��projectName
     * @param projectId
     * @return
     */
    public Map<String,Object> selectProjectNameAndDescById(Integer projectId){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("projectId",projectId);
        labacProjectsMapper.selectProjectNameAndDescById(map);
        return map;
    }
}
