package com.weichaishi.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weichaishi.dao.BaseMapper;
import com.weichaishi.model.LabacProjects;
import com.weichaishi.model.LabacTasks;
import com.weichaishi.model.ProjectsTasksView;
import com.weichaishi.result.PageResult;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.Collection;
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
    public  T queryOneById(ID id){
        return  baseMapper.selectByPrimaryKey(id);
    };

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

//    protected MAPPER mapper;

    public T insertMore(List<T> data) {
        T back = null;
        SqlSession batchSqlSession = null;
        try {
            batchSqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
            int batchCount = 500;//每批commit的个数
            for (int index = 0; index < data.size(); index++) {
                T t = data.get(index);
                back = t;
                Class<?>[] interfaces = baseMapper.getClass().getInterfaces();
                Class clazz = null;
                for (int i = 0; i < interfaces.length; i++) {
                    if (BaseMapper.class.isAssignableFrom(interfaces[i])) {
                        clazz = interfaces[i];
                    }
                }
                if (clazz == null) {
                    throw new Exception("user-defined exception:mapper not implements interfaces com.wcs.wms.dao.mapper.BaseMapper");
                }
                BaseMapper baseMapper = (BaseMapper) batchSqlSession.getMapper(clazz);
                baseMapper.insertSelective(t);
                if (index != 0 && index % batchCount == 0) {
                    batchSqlSession.commit();
                }
            }
            batchSqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (batchSqlSession != null) {
                batchSqlSession.close();
            }
            return back;
        }
     }
    public BigDecimal selectId(){
        SqlSession sqlSession = null;
        Map<String, BigDecimal> map = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            map = sqlSession.selectMap("com.weichaishi.dao.LabacProjectsMapper.selectId", "ID");
            Collection<BigDecimal> values = map.values();
            Object[] objects = values.toArray();
            map = (Map) objects[0];
            BigDecimal id = map.get("ID");
            sqlSession.commit();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(sqlSession != null){
                sqlSession.close();
            }
        }
        return null;
    }
}
