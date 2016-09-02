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
 * �ṩLabac_projects������Ľӿ�
 */
@Controller
@RequestMapping("/projects")
public class LabacProjectAction {

    @Autowired
    private LabacProjectsService labacProjectsService;

    /**
     * ����������ѯ��һ������
     * @param labacProjects
     * @return �Զ���������
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
     * ����������ѯ��һ������
     * @param id
     * @return �Զ���������
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
     * ����������ѯ�����
     * @param labacProjects ����ʵ��
     * @return �Զ���������
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
     * ��ҳ��ѯ
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
     * ����һ������
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
     * �޸�����
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
     * ��������ɾ��
     *
     * �����Է�����ʱ�ṩ�� projectDescֵΪ�ֶΣ���
     *
     * @param labacProjects
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public Object delete(LabacProjects labacProjects){
        JsonResponseResult<Object> result = new JsonResponseResult<Object>();
        if(StringUtil.isEmpty(labacProjects.getProjectDesc())){
            result.setErrorMsg("������Ϣ����");
            return result;
        }

        Integer count = labacProjectsService.delete(labacProjects);
        result.setData(count);
        return result;
    }

    /**
     * ��������ɾ��һ������
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
