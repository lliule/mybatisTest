package com.weichaishi.web;

import com.weichaishi.model.LabacProjects;
import com.weichaishi.result.PageResult;
import com.weichaishi.service.LabacProjectsService;
import com.weichaishi.utils.JsonResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;
import java.util.Map;

//import org.springframework.http.HttpStatus;

/**
 * Created by Administrator on 2016/8/31.
 *
 * 提供Labac_projects表操作的接口
 */
@Controller
@RequestMapping("/projects")
public class LabacProjectAction {

    @Autowired
    private LabacProjectsService labacProjectsService;

    /**
     * 根据条件查询出一条数据
     * @param labacProjects
     * @return 自定义结果类型
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
     * 根据主键查询出一条数据
     * @param id
     * @return 自定义结果类型
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
     * 根据条件查询结果集
     * @param labacProjects 条件实体
     * @return 自定义结果类型
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
     * @param pageNum
     * @param pageSize
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
     * 插入一条数据
     * @param labacProjects
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Object insertOne(LabacProjects labacProjects){
        JsonResponseResult<Map<String,Object>> jsonResponseResult = new JsonResponseResult<Map<String, Object>>();
        Map<String, Object> map = labacProjectsService.insertOne(labacProjects);
        jsonResponseResult.setData(map);
        return jsonResponseResult;
    }

    /**
     * 修改数据
     * @param labacProjects
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public Object update(LabacProjects labacProjects){
        JsonResponseResult<Integer> jsonResponseResult =  new JsonResponseResult<Integer>();
        Integer count = labacProjectsService.updateBySelective(labacProjects);
        jsonResponseResult.setData(count);
        return jsonResponseResult;
    }

    /**
     * 根据条件删除
     *
     * 本测试方法暂时提供以 projectDesc值为字段！！
     *
     * @param labacProjects
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public Object delete(LabacProjects labacProjects){
        JsonResponseResult<Object> result = new JsonResponseResult<Object>();
        if(StringUtil.isEmpty(labacProjects.getProjectDesc())){
            result.setErrorMsg("条件信息错误！");
            return result;
        }

        Integer count = labacProjectsService.delete(labacProjects);
        result.setData(count);
        return result;
    }

    /**
     * 根据主键删除一条数据
     * @param key
     * @return
     */
    @RequestMapping(value = "/{key}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteByPrimaryKey(@PathVariable("key")Integer key){
        JsonResponseResult<Integer> jsonResponseResult = new JsonResponseResult<Integer>();
        Integer count  = labacProjectsService.deleteByPrimaryKey(key);
        jsonResponseResult.setData(count);
        return jsonResponseResult;
    }
}
