labac_projects表操作的api 接口

/projects  + Get  queryOne:根据条件查询一个对象信息

/projects/{id} +Get   queryOneById:根据之间查询一条信息

/projects/list   +Get  queryList:根据条件查询结果集

/projects/page  +Get  queryPage:分页下旬

/projects   +Post   insertOne:插入一条数据

/projects  +Put   update: 更新一条数据


/projects/{key}   +DELETE     deleteByPrimaryKey：根据之间删除一条数据


labac_tasks表操作API接口说明：
/tasks  + Get  queryOne:根据条件查询出一条数据 ；

/tasks/{id} +Get   queryOneById:根据主键查询一条数据

/tasks/list   +Get  queryList:根据条件查询结果集；

/tasks/page  +Get  queryPage:分页查询

/tasks   +Post   insertOne:插入一条数据，若实体其他字段为NULL，插入NULL

/tasks  +Put   update: 根据主键修改数据信息，其他字段为null，默认不修改


/tasks/{key}   +DELETE     deleteByPrimaryKey：根据主键值删除数据信息


***************
labac_tasks 的 task_loc_geo字段的处理办法：
拆分组装后的数据如：
taskSdoGtype: 2001
taskSdosrid: 8307
taskSoPointX: 116.416379
taskSdoPointY: 40.060228
taskSdoPointZ: null
taskSdoOrdinates: null
taskSdoElemInfo: null
而不在有taskLocGeo字段

*******************
TODO：
1、写Advanced Rest Client的使用文档
2、写mybatis反转表生成实体的文档

