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
     * 存储过程简单示例
     * map： 条件是projectId  map的key 必须要和xml中的property值一样
     *
     * 调用完存储过程后，map中就会存在xml中定义好的以property 的值为Ｋｅｙ，存储过程返回的值为value的map；
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
     * 视图的简单示例
     * @return
     */
    public List<ProjectsTasksView> selectView(){
        List<ProjectsTasksView> list = labacProjectsMapper.selectView();
        doTaskLocGeoForList(list);
        return list;
    }

    /**
     * 处理 taskLocGeo 字段
     *解决 该字段不能被json化。 将该字段拆分为多个字段
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
     * 批量处理taskLocGeo字段
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
     * 查询视图
     * @param projectsTasksView
     * @return
     */
    public List<ProjectsTasksView> selectViewByProjectId(ProjectsTasksView projectsTasksView){
        List<ProjectsTasksView> list = projectsTasksViewMapper.select(projectsTasksView);
        doTaskLocGeoForList(list);
        return  list;
    }

    /**
     * 查询视图的部分字段
     * @return
     */
    public List<Map<String,Object>> selectViewPort(){
        return labacProjectsMapper.selectViewPart();
    }

    /**
     *使用map封装查询的表的部份字段
     * @param projectId
     * @return
     */
    public List<Map<String,Object>> selectMap(Integer projectId){
        return labacProjectsMapper.selectMap(projectId);
    }

    /**
     * 调用存储过程，根据projectId查询projectDesc和projectName
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
