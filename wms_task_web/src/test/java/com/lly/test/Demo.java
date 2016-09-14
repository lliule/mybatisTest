package com.lly.test;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weichaishi.model.LabacProjects;

import java.util.ArrayList;

public class Demo {

    public static  void  main(String[] args){
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<LabacProjects> list = new ArrayList<LabacProjects>();
        LabacProjects labacProjects = new LabacProjects();
        labacProjects.setProjectId(1);
        labacProjects.setProjectName("sdd");
        labacProjects.setProjectDesc("ddd");
        list.add(labacProjects);
        LabacProjects labacProjects1 = new LabacProjects();
        labacProjects1.setProjectId(2);
        labacProjects1.setProjectDesc("sasd");
        labacProjects1.setProjectName("asd");
        list.add(labacProjects1);
        try {
            String s = mapper.writeValueAsString(list);
            System.err.print(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
