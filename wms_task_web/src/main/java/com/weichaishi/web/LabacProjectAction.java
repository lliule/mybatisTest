package com.weichaishi.web;

import com.weichaishi.model.LabacProjects;
import com.weichaishi.result.PageResult;
import com.weichaishi.service.LabacProjectsService;
import com.weichaishi.utils.JsonResponseResult;
import com.weichaishi.utils.SysConstent;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.StringUtil;

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
}
