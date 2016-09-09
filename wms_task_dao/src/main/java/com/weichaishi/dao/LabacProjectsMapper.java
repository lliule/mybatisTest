package com.weichaishi.dao;

import com.weichaishi.model.LabacProjects;
import com.weichaishi.model.ProjectsTasksView;

import java.util.List;
import java.util.Map;


public interface LabacProjectsMapper extends BaseMapper<LabacProjects,Integer> {

//    Integer selectProjectId();

    Integer insertOne(LabacProjects labacProjects);

    void selectDemo(Map<String,Object> map);

    List<LabacProjects> selectProjectAndTasks();

    List<ProjectsTasksView> selectView();

    List<Map<String,Object>> selectViewPart();

    List<Map<String,Object>> selectMap(Integer projectId);

    void selectProjectNameAndDescById(Map<String, Object> map);
}
