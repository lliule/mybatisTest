package com.weichaishi.web;

import com.weichaishi.model.LabacTasks;
import com.weichaishi.result.PageResult;
import com.weichaishi.service.LabacTasksService;
import com.weichaishi.utils.JsonResponseResult;
import com.weichaishi.utils.SysConstent;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/tasks")
public class LabacTasksAction {

    @Autowired
    private LabacTasksService labacTasksService;

    /**
     * 条件查询一条信息
     * @param labacTasks
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Object queryOne(LabacTasks labacTasks){
        JsonResponseResult<LabacTasks> result = new JsonResponseResult<LabacTasks>();
        LabacTasks tasks = labacTasksService.queryOne(labacTasks);
        result.setData(tasks);
        return result;
    }

    /**
     * 根据id 查询一条信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object queryOneById(@PathVariable("id") Integer id){
        JsonResponseResult<LabacTasks> result = new JsonResponseResult<LabacTasks>();
        LabacTasks tasks = labacTasksService.queryOneById(id);
        result.setData(tasks);
        return result;
    }

    /**
     *根据条件查询结果集
     * @param labacTasks
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public Object queryList(LabacTasks labacTasks){
        JsonResponseResult<List<LabacTasks>> result = new JsonResponseResult<List<LabacTasks>>();
        List<LabacTasks> list = labacTasksService.queryList(labacTasks);
        result.setData(list);
        return result;
    }

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    public  Object queryPage(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                             @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize){
        JsonResponseResult<PageResult> result = new JsonResponseResult<PageResult>();
        PageResult page = labacTasksService.queryPage(pageNum, pageSize);
        result.setData(page);
        return result;
    }

    /**
     * 插入一条数据
     * @param labacTasks
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Object insertOne(LabacTasks labacTasks){
        JsonResponseResult<Map<String,Object>> result = new JsonResponseResult<Map<String,Object>>();
        Map<String, Object> map = labacTasksService.insertOne(labacTasks);
        if(map == null){
            result.setErrorMsg(SysConstent.INSERTERR);
            result.setCode(SysConstent.ERRCODE);
            result.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        result.setData(map);
        return result;
    }

    /**
     * 修改一条信息
     * @param labacTasks
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public Object update(LabacTasks labacTasks){
        JsonResponseResult<Integer> result = new JsonResponseResult<Integer>();
        Integer count = labacTasksService.updateBySelective(labacTasks);
        if (count == 0) {
            result.setErrorMsg(SysConstent.UPDATEERR);
            result.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
            result.setCode(SysConstent.ERRCODE);
        }
        return result;
    }


    /**
     * 删除一条信息
     * @param key
     * @return
     */
    @RequestMapping(value = "/{key}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteByPrimaryKey(@PathVariable("key")Integer key){
        JsonResponseResult<Integer> result = new JsonResponseResult<Integer>();
        Integer count = labacTasksService.deleteByPrimaryKey(key);
        if(count == 0){
            result.setErrorMsg(SysConstent.DELETEERR);
            result.setCode(SysConstent.ERRCODE);
            result.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        return result;
    }

    /**
     * 条件分页查询
     * TODO  SERVICE 组装条件
     */
    /*@RequestMapping(value = "/list/page",method = RequestMethod.GET)
    @ResponseBody
    public Object queryListByPage(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                  @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize){
        JsonResponseResult<PageResult> jsonResponseResult = new JsonResponseResult<PageResult>();
        try {
            PageResult page = labacTasksService.queryListByPage(pageNum, pageSize);
            jsonResponseResult.setData(page);
            return jsonResponseResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }*/

}
