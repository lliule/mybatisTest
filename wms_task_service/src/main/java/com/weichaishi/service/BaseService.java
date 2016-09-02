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
 * ͨ�õ�service�࣬����ҵ���Ĺ��÷�����ȡ�ࡣ
 * ֻ֧�ּ̳�ʹ��
 */
public abstract class BaseService<T,ID extends Serializable> {

    @Autowired
    private BaseMapper<T,ID> baseMapper;

    /**
     * ����������ѯһ��������Ϣ
     * @param entity
     * @return
     */
    public T queryOne(T entity){

        return  baseMapper.selectOne(entity);


    }

    /**
     * ����������ѯһ��������Ϣ
     * @param key
     * @return
     */
    public T queryByPrimaryKey(ID key){
        return baseMapper.selectByPrimaryKey(key);
    }

    /**
     * ��ѯ���ж�����Ϣ
     * ���ã�
     * @return
     */
    public List<T> queryAll(){
        return baseMapper.selectAll();
    }

    /**
     * ����������ѯ�����
     * @param entity
     * @return
     */
    public List<T> queryList(T entity){
        return baseMapper.select(entity);
    }
    /**
     * ��ҳ��ѯ
     * @param pageNum ��ѯ�ĳ�ʼλ��
     * @param pageSize ÿҳ������
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
     * ����һ������
     * @param entity
     * @return
     */
    public Integer insert(T entity){
//        entity.getClass().getMethods();

       return baseMapper.insertSelective(entity);
    }


    /**
     * ��������
     * @param list
     * @return
     */
    public Integer insertBatch(List<T> list){
        return baseMapper.insertList(list);
    }
    /**
     * ���������޸�������Ϣ��ʵ���б���Ҫ��������Ϣ
     * ���������������ֵ��ȫ���޸�ΪNull
     *
     * @param entity
     * @return
     */
    public Integer update(T entity){
        return baseMapper.updateByPrimaryKey(entity);
    }

    /**
     * ���������޸�������Ϣ��ʵ���б���Ҫ��������Ϣ
     * ���������������ֵ����Ĭ�ϲ��޸�
     * TODO�� �ܷ�ͨ����������޸ĸö���ĸ���ʱ�䣬��ͳһʵ�ָ���ʱ���ˢ��
     * @param entity ���ݵ�ʵ�������
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
     * ��������ɾ��������Ϣ
     * @param key ����ֵ
     * @return ���ݿⱻӰ�������
     */
    public Integer deleteByPrimaryKey(ID key){
        return baseMapper.deleteByPrimaryKey(key);
    }

    /**
     * ��������ɾ��������Ϣ
     * @param entity
     * @return
     */
    public Integer delete(T entity){
        return baseMapper.delete(entity);
    }

    /**
     * ����������ѯ
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
