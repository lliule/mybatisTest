package com.weichaishi.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weichaishi.dao.LabacTasksMapper;
import com.weichaishi.model.LabacProjects;
import com.weichaishi.model.LabacTasks;
import com.weichaishi.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *labac_tasks表  操作service
 */
@Service
public class LabacTasksService extends BaseService<LabacTasks,Integer> {

    @Autowired
    private LabacTasksMapper labacTasksMapper;

    @Override
    public LabacTasks queryOne(LabacTasks entity) {
        LabacTasks labacTasks = super.queryOne(entity);
        doTaskLocGeo(labacTasks);
        return labacTasks;
    }

    @Override
    public LabacTasks queryByPrimaryKey(Integer key) {
        LabacTasks labacTasks = super.queryByPrimaryKey(key);
        doTaskLocGeo(labacTasks);
        return labacTasks;
    }

    @Override
    public List<LabacTasks> queryAll() {
        List<LabacTasks> list = super.queryAll();
        doTaskLocGeoForList(list);
        return list;
    }

    @Override
    public List<LabacTasks> queryList(LabacTasks entity) {
        List<LabacTasks> list = super.queryList(entity);
        doTaskLocGeoForList(list);
        return list;
    }

    @Override
    public PageResult queryPage(Integer pageNum, Integer pageSize) {
        PageResult pageResult = super.queryPage(pageNum, pageSize);
        PageResult result = new PageResult();
        List<LabacTasks> list = (List<LabacTasks>) pageResult.getData();
        doTaskLocGeoForList(list);
        result.setData(list);
        result.setPageSize(pageResult.getPageSize());
        result.setTotalCount(pageResult.getTotalCount());
        result.setPageNum(pageResult.getPageNum());
        return result;
    }

    /**
     * 条件分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageResult queryListByPage(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        Example example = new Example(LabacTasks.class);
        example.createCriteria().andEqualTo("taskCityId",1101);
        List<LabacTasks> list = labacTasksMapper.selectByExample(example);
        PageInfo<LabacTasks> pageInfo = new PageInfo<LabacTasks>(list);
        doTaskLocGeoForList(pageInfo.getList());
        PageResult result = new PageResult();
        result.setData(pageInfo.getList());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotalCount(pageInfo.getTotal());
        return result;
    }


    @Override
    public Integer updateBySelective(LabacTasks entity) {
        entity.setTaskUpdateTime(new Date());
        return super.updateBySelective(entity);
    }


    public Map<String,Object> insertOne(LabacTasks entity) {
        Map<String,Object> map = new HashMap<String, Object>();
        entity.setTaskCreateTime(new Date());
        entity.setTaskUpdateTime(entity.getTaskCreateTime());
        Integer count = labacTasksMapper.insertOne(entity);
        if(count == 0){
            return null;
        }
        map.put("taskId",entity.getTaskId());
        return map;
    }


    /**
     * 批量插入
     * @param labacTasksList
     * @return
     */
    public LabacTasks insertBatch(List<LabacTasks> labacTasksList){
        for (LabacTasks labacTasks : labacTasksList){
            labacTasks.setTaskCreateTime(new Date());
            labacTasks.setTaskUpdateTime(labacTasks.getTaskCreateTime());
        }
        return super.insertMore(labacTasksList);
    }

    /**
     * 处理 taskLocGeo 字段
     *解决 该字段不能被json化。 将该字段拆分为多个字段
     * @param labacTasks
     */
    private void doTaskLocGeo(LabacTasks labacTasks){
        if(labacTasks != null) {

            Struct locGeo = (Struct) labacTasks.getTaskLocGeo();
            try {
                if(locGeo != null){

                    Object[] objects = locGeo.getAttributes();
                    labacTasks.setTaskSdoGtype(objects[0]);
                    labacTasks.setTaskSdosrid(objects[1]);
                    if(objects[2] != null){
                        Struct object = (Struct) objects[2];
                        Object[] attributes = object.getAttributes();

                        labacTasks.setTaskSdoPointX((BigDecimal)attributes[0]);
                        labacTasks.setTaskSdoPointY((BigDecimal)attributes[1]);
                        labacTasks.setTaskSdoPointZ((BigDecimal)attributes[2]);
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
    private void doTaskLocGeoForList(List<LabacTasks> list){
        if(list != null && !list.isEmpty()) {
            for (LabacTasks labacTasks : list) {
                doTaskLocGeo(labacTasks);
            }
        }
    }



}
