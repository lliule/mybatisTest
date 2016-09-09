package com.weichaishi.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weichaishi.dao.BaseMapper;
import com.weichaishi.model.LabacTasks;
import com.weichaishi.model.ProjectsTasksView;
import com.weichaishi.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.List;
import java.util.Map;

/**
 *
 * 通用service，
 * 只能被继承使用
 */
public abstract class BaseService<T,ID extends Serializable> {

    @Autowired
    private BaseMapper<T,ID> baseMapper;

    /**
     *查询一个信息
     * @param entity
     * @return
     */
    public T queryOne(T entity){

        return  baseMapper.selectOne(entity);


    }

    /**
     * 根据主键查询一个对象
     * @param key
     * @return
     */
    public T queryByPrimaryKey(ID key){
        return baseMapper.selectByPrimaryKey(key);
    }

    /**
     *查询所有
     * @return
     */
    public List<T> queryAll(){
        return baseMapper.selectAll();
    }

    /**
     * 根据条件查询结果集
     * @param entity
     * @return
     */
    public List<T> queryList(T entity){
        return baseMapper.select(entity);
    }
    /**
     * 分页查询
     * @param pageNum 起始位置
     * @param pageSize 每页的条数
     * @return
     */
    public PageResult queryPage(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<T> list = baseMapper.selectAll();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        PageResult result = new PageResult();
        result.setPageSize(pageInfo.getPageSize());
        result.setTotalCount(pageInfo.getTotal());
        result.setPageNum(pageInfo.getPageNum());
        result.setData(pageInfo.getList());
        return result;
    }

    /**
     *插入一条数据信息
     * @param entity
     * @return
     */
    public Integer insert(T entity){
//        entity.getClass().getMethods();

       return baseMapper.insertSelective(entity);
    }


    /**
     *批量插入
     * @param list
     * @return
     */
    public Integer insertBatch(List<T> list){
        return baseMapper.insertList(list);
    }
    /**
     修改数据信息
     * @param entity
     * @return
     */
    public Integer update(T entity){
        return baseMapper.updateByPrimaryKey(entity);
    }


    /**
     * 条件修改信息
     * 其他不修改的字段默认不变
     * @param entity
     * @return
     */
    public Integer updateBySelective(T entity){
//        Method[] methods = entity.getClass().getMethods();
//        Class<?> aClass = entity.getClass();
     /*   for(Method method : methods){
            String name = method.getName();
            if(name.contains("Update")){
                if(name.contains("set")){
                    try {
                        Object o = entity.getClass().newInstance();
                        method.invoke(o, new Date());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    }
                }

            }
        }*/

        return baseMapper.updateByPrimaryKeySelective(entity);
    }

    /**
     * 根据主键删除
     * @param key
     * @return
     */
    public Integer deleteByPrimaryKey(ID key){
        return baseMapper.deleteByPrimaryKey(key);
    }

    /**
     * 根据条件删除
     * @param entity
     * @return
     */
    public Integer delete(T entity){
        return baseMapper.delete(entity);
    }

    /**
     * 根据Id 查询一条信息
     * @param id
     * @return
     */
    public  T queryOneById(Integer id){
        return  baseMapper.selectByPrimaryKey(id);
    };




  /*  private T model;

    public BaseService() {
        ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
        System.err.println("type==" + type);
        Type type1 = type.getActualTypeArguments()[0];

        System.out.println("entityClass==" + type.getActualTypeArguments()[0]);
        System.out.println("getOwnerType==" + type.getOwnerType());
        System.out.println("getRawType==" + type.getRawType());
        model = type1.
    }*/

}
