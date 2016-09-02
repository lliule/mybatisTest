labac_projects表操作：

/projects  + Get  queryOne:根据条件查询出一条数据 ；

/projects/{id} +Get   queryOneById:根据主键值查询一条数据；

/projects/list   +Get  queryList:根据条件查询结果集；

/projects/page  +Get  queryPage:分页查询

/projects   +Post   insertOne:插入一条数据，若实体其他字段为NULL，插入NULL

/projects  +Put   update: 根据主键修改数据信息，其他字段为null，默认不修改

/projects  +DELETE  delete：根据条件删除数据信息，本例暂时提供以projectDesc值为条件进行删除。
注意本方法一定要限制条件删除，否则删除表中所有数据。

/projects/{key}   +DELETE     deleteByPrimaryKey：根据主键值删除数据信息


labac_tasks表操作：
/tasks  + Get  queryOne:根据条件查询出一条数据 ；

/tasks/{id} +Get   queryOneById:根据主键值查询一条数据；

/tasks/list   +Get  queryList:根据条件查询结果集；

/tasks/page  +Get  queryPage:分页查询


/tasks   +Post   insertOne:插入一条数据，若实体其他字段为NULL，插入NULL

/tasks  +Put   update: 根据主键修改数据信息，其他字段为null，默认不修改

/tasks  +DELETE  delete：根据条件删除数据信息，本例暂时提供以taskCityId值为条件进行删除。
注意本方法一定要限制条件删除，否则删除表中所有数据。

/tasks/{key}   +DELETE     deleteByPrimaryKey：根据主键值删除数据信息


***************
关于labac_tasks 的 task_loc_geo字段的处理办法：
拆分组装后的数据如：
taskSdoGtype: 2001
taskSdosrid: 8307
taskSoPointX: 116.416379
taskSdoPointY: 40.060228
taskSdoPointZ: null
taskSdoOrdinates: null
taskSdoElemInfo: null
而不再有taskLocGeo字段

*******************
TODO：
1、写Advanced Rest Client的使用文档
2、写mybatis反转表生成实体的文档