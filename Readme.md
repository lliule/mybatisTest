labac_projects表操作的api 接口

/projects  + Get  queryOne:根据条件查询一个对象信息

/projects/{id} +Get   queryOneById:根据之间查询一条信息

/projects/list   +Get  queryList:根据条件查询结果集

/projects/page  +Get  queryPage:分页下旬

/projects   +Post   insertOne:插入一条数据

/projects  +Put   update: 更新一条数据

/projects/{key}   +DELETE     deleteByPrimaryKey：根据之间删除一条数据

/projects/task  +GET selectProject:多表查询示例接口（projects和tasks表）

/projects/demo/{projectId}  +Get  selectDemo:存储过程示例接口（输入id，输出id）

/projects/view  +Get selectView:视图示例接口（返回视图结果）

/projects/views  +Get  selectViewByProjectId：使用实体类映射视图结果

/projects/view/part  +get  selectViewPart:将视图结果封装map集合测试接口

/projects/map  +get  selectMap :将表结果封装map集合测试接口

/projects//map/{projectId} +get  selectProjectNameAndDescById：存储过程示例接口，
根据主键projectId查询ProjectName和projectDesc


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

本项目中的project.xml中，有一个调用存储过程的简单示例。
TODO：
多表查询（projects 和 tasks 表的联查）
视图，使用视图来实现多表联查.


************************************
优化：将处理task的taskLocGeo字段代码提取出来
