package com.weichaishi.web;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weichaishi.model.LabacProjects;
import com.weichaishi.model.ProjectsTasksView;
import com.weichaishi.result.PageResult;
import com.weichaishi.service.LabacProjectsService;
import com.weichaishi.utils.JsonResponseResult;
import com.weichaishi.utils.Projects;
import com.weichaishi.utils.SysConstent;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/projects")
public class LabacProjectAction {

    @Autowired
    private LabacProjectsService labacProjectsService;

    /**
     *根据条件查询一条信息
     * @param labacProjects
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Object queryOne(LabacProjects labacProjects){
        LabacProjects labacProjects1 = labacProjectsService.queryOne(labacProjects);
        JsonResponseResult<LabacProjects> jsonResponseResult = new JsonResponseResult<LabacProjects>();
        jsonResponseResult.setData(labacProjects1);
        return jsonResponseResult;
    }

    /**
     *根据Id 查询一条数据
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Object queryOneById(@PathVariable("id")Integer id){
        JsonResponseResult<LabacProjects> jsonResponseResult = new JsonResponseResult<LabacProjects>();
        LabacProjects labacProjects = labacProjectsService.queryOneById(id);
        jsonResponseResult.setData(labacProjects);
        return jsonResponseResult;
    }


    /**
     *根据条件查询结果集
     * @param labacProjects 条件对象
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public Object queryList(LabacProjects labacProjects){

        List<LabacProjects> list = labacProjectsService.queryList(labacProjects);
        JsonResponseResult<List<LabacProjects>> jsonResponseResult = new JsonResponseResult<List<LabacProjects>>();
        jsonResponseResult.setData(list);
        return jsonResponseResult;
    }

    /**
     * 分页查询
     * @param pageNum 起始位置
     * @param pageSize 每页的条数
     * @return
     */
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    public Object queryPage(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                            @RequestParam(value="pageSize",defaultValue = "10") Integer pageSize){
        PageResult pageResult = labacProjectsService.queryPage(pageNum, pageSize);
        JsonResponseResult<PageResult> jsonResponseResult = new JsonResponseResult<PageResult>();
        jsonResponseResult.setData(pageResult);
        return jsonResponseResult;
    }

    /**
     *插入一条数据
     * @param labacProjects
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Object insertOne(LabacProjects labacProjects){
        JsonResponseResult<Map<String,Object>> jsonResponseResult = new JsonResponseResult<Map<String, Object>>();
        Map<String, Object> map = labacProjectsService.insertOne(labacProjects);
        if(map == null){
            jsonResponseResult.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
            jsonResponseResult.setCode(SysConstent.ERRCODE);
            jsonResponseResult.setErrorMsg(SysConstent.INSERTERR);
        }
        jsonResponseResult.setData(map);
        return jsonResponseResult;
    }

    /**
     *修改一条数据
     * @param labacProjects
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public Object update(LabacProjects labacProjects){
        JsonResponseResult<Integer> jsonResponseResult =  new JsonResponseResult<Integer>();
        Integer count = labacProjectsService.updateBySelective(labacProjects);
        if(count == 0){
            jsonResponseResult.setCode(SysConstent.ERRCODE);
            jsonResponseResult.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
            jsonResponseResult.setErrorMsg(SysConstent.UPDATEERR);
        }
        return jsonResponseResult;
    }


    /**
     *根据主键删除数据信息
     * @param key
     * @return
     */
    @RequestMapping(value = "/{key}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteByPrimaryKey(@PathVariable("key")Integer key){
        JsonResponseResult<Integer> jsonResponseResult = new JsonResponseResult<Integer>();
        Integer count  = labacProjectsService.deleteByPrimaryKey(key);
        if(count == 0){
            jsonResponseResult.setCode(SysConstent.ERRCODE);
            jsonResponseResult.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
            jsonResponseResult.setErrorMsg(SysConstent.DELETEERR);
        }
        return jsonResponseResult;
    }

    /**
     * 多表查询示例接口
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/task",method = RequestMethod.GET)
    @ResponseBody
    public Object selectProject(@RequestParam(value = "pageNum" , defaultValue = "1")Integer pageNum,
                                @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize){
        JsonResponseResult<PageResult> result = new JsonResponseResult<PageResult>();
        PageResult pageResult = labacProjectsService.selectProjectAndTasks(pageNum, pageSize);
        result.setData(pageResult);
        return result;
    }

    /**
     * 存储过程示例接口
     * @param projectId
     * @return
     */
    @RequestMapping(value = "/demo/{projectId}",method = RequestMethod.GET)
    @ResponseBody
    public  Object selectDemo(@PathVariable("projectId") Integer projectId){
        JsonResponseResult<Object> result = new JsonResponseResult<Object>();
        Object id = labacProjectsService.selectDemo(projectId);
        result.setData(id);
        return result;
    }

    /**
     * 视图的示例接口
     * @return
     */
    @RequestMapping(value = "/view",method = RequestMethod.GET)
    @ResponseBody
    public Object selectView(){
        JsonResponseResult<List<ProjectsTasksView>> result = new JsonResponseResult<List<ProjectsTasksView>>();
        List<ProjectsTasksView> list = labacProjectsService.selectView();
        result.setData(list);
        return result;
    }

    /**
     * 视图示例接口
     * 使用实体类映射视图结果
     * @param projectsTasksView
     * @return
     */
    @RequestMapping(value = "/views",method = RequestMethod.GET)
    @ResponseBody
    public Object selectViewByProjectId(ProjectsTasksView projectsTasksView){
        JsonResponseResult<List<ProjectsTasksView>> result = new JsonResponseResult<List<ProjectsTasksView>>();
        List<ProjectsTasksView> list = labacProjectsService.selectViewByProjectId(projectsTasksView);
        result.setData(list);
        return result;
    }

    /**
     * 封装查询视图结果到map集合测试接口
     * @return
     */
    @RequestMapping(value = "/view/part",method = RequestMethod.GET)
    @ResponseBody
    public Object selectViewPart(){
        JsonResponseResult<List<Map<String, Object>>> result = new JsonResponseResult<List<Map<String, Object>>>();
        List<Map<String, Object>> maps = labacProjectsService.selectViewPort();
        result.setData(maps);
        return result;
    }

    /**
     * 封装查询表结果到map集合测试接口
     * @param projectId
     * @return
     */
    @RequestMapping(value = "/map",method = RequestMethod.GET)
    @ResponseBody
    public Object selectMap(@RequestParam("projectId")Integer projectId){
        JsonResponseResult<List<Map<String, Object>>> result = new JsonResponseResult<List<Map<String, Object>>>();
        List<Map<String,Object>> map = labacProjectsService.selectMap(projectId);
        result.setData(map);
        return result;
    }

    /**
     * 使用存储过程
     * 根据主键查询projectName和projectDesc
     * @param projectId
     * @return
     */
    @RequestMapping(value="/map/{projectId}",method = RequestMethod.GET)
    @ResponseBody
    public Object selectProjectNameAndDescById(@PathVariable("projectId")Integer projectId){
        JsonResponseResult<Map<String, Object>> result = new JsonResponseResult<Map<String, Object>>();
        Map<String, Object> map = labacProjectsService.selectProjectNameAndDescById(projectId);
        result.setData(map);
        return result;
    }

    /**
     * 批量插入，接受的是对象数组，格式如下：
     * list[0].projectName=哇哈哈哈&list[0].projectDesc=哈哈哈&list[0].projectOrder=1&list[1].projectName=哇嘿嘿&
     * list[1].projectDesc=嘿嘿&list[1].projectOrder=1
     *
     * eg：list%5B0%5D.projectName=%E5%93%87%E5%93%88%E5%93%88%E5%93%88&list%5B0%5D.projectDesc=%E5%93%88%E5%93%88%E5%93%88&
     * list%5B1%5D.projectName=%E5%93%87%E5%98%BF%E5%98%BF&list%5B1%5D.projectDesc=%E5%98%BF%E5%98%BF&list%5B0%5D.projectOrder=1&list%5B1%5D.projectOrder=1
     * @param projects
     * @return
     */
    @RequestMapping(value="/batch",method = RequestMethod.POST)
    @ResponseBody
    public Object insertBatch(Projects projects){
        JsonResponseResult<List<Integer>> result = new JsonResponseResult<List<Integer>>();
        List<Integer> list = labacProjectsService.insertBatch(projects.getList());
        result.setData(list);
        return result;
    }

    /**
     * 批量插入--接受Json格式数据；格式如下“：
     * [
     * {
     * "projectName":"ll哈撒尅",
     * "projectDesc":"ll亚索",
     * "projectOrder":1
     * },
     * {"projectName":"ll螺旋手里剑",
     * "projectDesc":"ll哪里逃",
     * "projectOrder":1}
     * ]
     *
     * @param jsonData
     * @return
     */
    @RequestMapping(value="/batch/json",method = RequestMethod.POST)
    @ResponseBody
    public Object insertBatchForJson(@RequestBody String jsonData){
        JsonResponseResult<Object> result = new JsonResponseResult<Object>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<LabacProjects> value =(List<LabacProjects>) mapper.readValue(jsonData, new TypeReference<List<LabacProjects>>() {
            });
            List<Integer> list = labacProjectsService.insertBatch(value);
            result.setData(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
