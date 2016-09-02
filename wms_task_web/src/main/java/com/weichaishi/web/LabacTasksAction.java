package com.weichaishi.web;

import com.weichaishi.model.LabacTasks;
import com.weichaishi.result.PageResult;
import com.weichaishi.service.LabacTasksService;
import com.weichaishi.utils.JsonResponseResult;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 *
 * �ṩ labac_tasks������ӿ�
 */
@Controller
@RequestMapping("/tasks")
public class LabacTasksAction {

    @Autowired
    private LabacTasksService labacTasksService;

    private static  final String FALSE = "F";
    /**
     *  ��ѯһ����Ϣ
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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object queryOneById(@PathVariable("id") Integer id){
        JsonResponseResult<LabacTasks> result = new JsonResponseResult<LabacTasks>();
        LabacTasks tasks = labacTasksService.queryOneById(id);
        result.setData(tasks);
        return result;
    }

    /**
     * ����������ѯ�����
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
     * ��ҳ��ѯ
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
     * ����һ��������Ϣ
     * @param labacTasks
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Object insertOne(LabacTasks labacTasks){
        JsonResponseResult<Map<String,Object>> result = new JsonResponseResult<Map<String,Object>>();
        Map<String, Object> map = labacTasksService.insertOne(labacTasks);
        if(map == null){
            result.setErrorMsg("�������ʧ�ܣ�");
            result.setCode(FALSE);
            result.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        result.setData(map);
        return result;
    }

    /**
     * ����һ��������Ϣ
     * @param labacTasks
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public Object update(LabacTasks labacTasks){
        JsonResponseResult<Integer> result = new JsonResponseResult<Integer>();
        Integer count = labacTasksService.updateBySelective(labacTasks);
        if (count == 0) {
            result.setErrorMsg("��������ʧ�ܣ�");
            result.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
            result.setCode(FALSE);
        }
        return result;
    }


    /**
     * ��������ɾ��һ��������Ϣ
     * @param key
     * @return
     */
    @RequestMapping(value = "/{key}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteByPrimaryKey(@PathVariable("key")Integer key){
        JsonResponseResult<Integer> result = new JsonResponseResult<Integer>();
        Integer count = labacTasksService.deleteByPrimaryKey(key);
        if(count == 0){
            result.setErrorMsg("����ɾ��ʧ�ܣ�");
            result.setCode(FALSE);
            result.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        return result;
    }

    /**
     * ��ҳ������ѯ
     * TODO  SERVICE ����������
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
