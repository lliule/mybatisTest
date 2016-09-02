package com.weichaishi.dao;

import com.weichaishi.model.LabacTasks;
import org.apache.ibatis.annotations.Param;


public interface LabacTasksMapper extends BaseMapper<LabacTasks,Integer> {

    /*LabacTasks queryOneLT(@Param("id")Integer id);*/
    LabacTasks queryOneLT(@Param("taskId")Integer taskId);

    Integer insertOne(LabacTasks labacTasks);

    /*Integer selectTaskId(@Param("dual")String dual);*/
//    Integer insertOne(LabacTasks labacTasks,@Param("SdoPointX") Float sdoPointX,@Param("SdoPointY") Float sdoPointY);
}
