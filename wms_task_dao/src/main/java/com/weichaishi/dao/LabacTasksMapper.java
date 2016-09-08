package com.weichaishi.dao;

import com.weichaishi.model.LabacTasks;
import org.apache.ibatis.annotations.Param;


public interface LabacTasksMapper extends BaseMapper<LabacTasks,Integer> {

//    LabacTasks queryOneLT(@Param("taskId")Integer taskId);

    Integer insertOne(LabacTasks labacTasks);

//    LabacTasks selectTasksByProjectId();
}
