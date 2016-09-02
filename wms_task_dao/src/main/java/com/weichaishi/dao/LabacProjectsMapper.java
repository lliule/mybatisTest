package com.weichaishi.dao;

import com.weichaishi.model.LabacProjects;


public interface LabacProjectsMapper extends BaseMapper<LabacProjects,Integer> {

    Integer selectProjectId();
}
