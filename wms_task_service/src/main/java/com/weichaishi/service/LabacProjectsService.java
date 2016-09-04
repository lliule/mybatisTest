package com.weichaishi.service;

import com.weichaishi.dao.LabacProjectsMapper;
import com.weichaishi.model.LabacProjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class LabacProjectsService extends BaseService<LabacProjects,Integer> {

    @Autowired
    private LabacProjectsMapper labacProjectsMapper;

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

}
