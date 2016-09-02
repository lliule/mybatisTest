package com.weichaishi.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weichaishi.dao.BaseMapper;
import com.weichaishi.model.LabacTasks;
import com.weichaishi.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 通用的service类，基本业务层的公用方法抽取类。
 * 只支持继承使用
 */
public abstract class BaseService<T,ID extends Serializable> {

    @Autowired
    private BaseMapper<T,ID> baseMapper;

    /**
     * 根据条件查询一个对象信息
     * @param entity
     * @return
     */
    public T queryOne(T entity){

        return  baseMapper.selectOne(entity);


    }

    /**
     * 根据主键查询一个对象信息
     * @param key
     * @return
     */
    public T queryByPrimaryKey(ID key){
        return baseMapper.selectByPrimaryKey(key);
    }

    /**
     * 查询所有对象信息
     * 慎用！
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
     * @param pageNum 查询的初始位置
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
     * 插入一条数据
     * @param entity
     * @return
     */
    public Integer insert(T entity){
//        entity.getClass().getMethods();

       return baseMapper.insertSelective(entity);
    }


    /**
     * 批量插入
     * @param list
     * @return
     */
    public Integer insertBatch(List<T> list){
        return baseMapper.insertList(list);
    }
    /**
     * 根据主键修改数据信息，实体中必须要有主键信息
     * 如果其他参数不赋值，全部修改为Null
     *
     * @param entity
     * @return
     */
    public Integer update(T entity){
        return baseMapper.updateByPrimaryKey(entity);
    }

    /**
     * 根据主键修改数据信息。实体中必须要有主键信息
     * 如果其他参数不赋值，则默认不修改
     * TODO： 能否通过反射机制修改该对象的更新时间，来统一实现更新时间的刷新
     * @param entity 传递的实体类参数
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
     * 根据主键删除数据信息
     * @param key 主键值
     * @return 数据库被影响的条数
     */
    public Integer deleteByPrimaryKey(ID key){
        return baseMapper.deleteByPrimaryKey(key);
    }

    /**
     * 根据条件删除数据信息
     * @param entity
     * @return
     */
    public Integer delete(T entity){
        return baseMapper.delete(entity);
    }

    /**
     * 根据主键查询
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
