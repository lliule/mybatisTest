package com.weichaishi.dao;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

import java.io.Serializable;

/**
 *
 *
 *通用mapper接口
 *
 * T  实体类
 *
 * ID  主键id的数据类型
 */
public interface BaseMapper<T,ID extends Serializable> extends Mapper<T>,InsertListMapper<T> {


}

