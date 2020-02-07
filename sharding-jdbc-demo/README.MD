 # sharding-jdbc-demo
通过springboot + sharding-jdbc 实现数据库分库分表功能。

## 使用
1. 将demo-ddl.sql 在自己的数据库中执行
2. application-sharding.yml 分库分表相关配置
3. 将application-sharding.yml中的db0,db1数据库连接改为自己的数据库地址
3. 运行test中的单元测试demo即可。

## demo 实现功能
1. 分库分表
2. 通过分片键增、删、改、查单表案例  
    a. 会通过分片键直接定位到对应库中的对应表
3. 通过分片键连表查询案例  
    a. 查询条件中指定分表键，会定位到对应表（多个分片键，必须全指定）  
    b. 查询条件中没有指定分表键，会全路由查询(笛卡尔积)  
    c. 查询条件中指定某个表分片键a，其他表的分片键b没有指定，但是在关联条件中指定，不生效，会全路由查询（笛卡尔积 ）  
    d. 配置表，如果指定了是广播表，则会在所有库中同步修改，创建。  
    e. 配置表，如果没有指定是广播表，则增删改查会随机一个库或默认库
4. 没有分片键查询，会全路由查询，效率很低。


## 参考文档
[shardingSphere 官方文档](https://shardingsphere.apache.org/document/current/cn/overview/)

[官方demo](https://github.com/apache/incubator-shardingsphere-example)