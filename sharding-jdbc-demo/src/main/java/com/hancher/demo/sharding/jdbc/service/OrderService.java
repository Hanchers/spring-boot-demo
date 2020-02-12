package com.hancher.demo.sharding.jdbc.service;

import com.hancher.demo.sharding.jdbc.repository.entity.OrderEntity;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderHandleEntity;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderHandleRecordEntity;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderLevelEntity;

import java.util.List;
import java.util.Map;

public interface OrderService {

    //单表操作
    int createOrder(OrderEntity order);

    int createOrderWithHandle(OrderEntity order, OrderHandleEntity handler, OrderHandleRecordEntity record);

    int updateOrder(OrderEntity order);

    int deleteOrder(OrderEntity order);
    int deleteOrderById(Long id);

    OrderEntity selectByShardingColumn(Integer handlerCode);
    List<OrderEntity> selectByShardingColumns(List<Integer> handlerCodes);
    List<OrderEntity> selectByShardingColumnsAndIds(List<Integer> handlerCodes,List<Long> ids);



    //连表操作

    ////关联表查
    Map selectAllAboutTable(Integer handlerCode);

    ////关联表+配置表
    Map selectAllTable(Integer handlerCode);

    //非拆分表操作

    OrderLevelEntity seleteLevelByCode(Integer code);

    void createLevel(OrderLevelEntity orderLevelEntity);
}
