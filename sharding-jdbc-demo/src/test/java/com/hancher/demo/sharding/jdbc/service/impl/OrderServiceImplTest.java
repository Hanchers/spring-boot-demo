package com.hancher.demo.sharding.jdbc.service.impl;

import com.hancher.demo.sharding.jdbc.BaseTest;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderEntity;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderHandleEntity;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderHandleRecordEntity;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderLevelEntity;
import com.hancher.demo.sharding.jdbc.service.OrderService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;


class OrderServiceImplTest extends BaseTest {
    @Autowired
    OrderService orderService;

    @Test
    void createOrder() {
        int code = 6;
        OrderEntity order = new OrderEntity();
        order.setOrderCode("order-"+code);
        order.setBizCode("hancher-test-"+code);
        order.setOrderDesc("测试分表"+code);
        order.setHandlerCode(code);
        order.setOneCode("100");
        order.setTwoCode("100100");
        order.setIsTimeout(0);
        order.setStatus("1");
        order.setTimeoutTime(new Date());
        order.setStartStamp(1000L);

        OrderHandleEntity handler = new OrderHandleEntity();
        handler.setCenterName("北京");
        handler.setCityCode("BEIJING");
        handler.setHandlerCode(code);
        handler.setHandlerName("操作人-"+code);
        handler.setOrderCode("order-"+code);

        OrderHandleRecordEntity record = new OrderHandleRecordEntity();
        record.setContent("通过");
        record.setHandleTime(new Date());
        record.setOperatorCode(code);
        record.setOrderCode("order-"+code);
        record.setRemark("hahahah");
        record.setOperatorRole("管理员");
//        orderService.createOrder(order);
        orderService.createOrderWithHandle(order, handler, record);
    }

    @Test
    void updateOrder() {
    }

    @Test
    void deleteOrder() {
//        orderService.deleteOrderById(1L);

        OrderEntity order = new OrderEntity();
        order.setId(432635924531118080L);
        order.setHandlerCode(1);
        orderService.deleteOrder(order);
    }

    @Test
    void selectByShardingColumn() {
        OrderEntity o1 = orderService.selectByShardingColumn(1);
        Assert.assertEquals(1,o1.getHandlerCode().intValue());

        OrderEntity o2 = orderService.selectByShardingColumn(2);
        Assert.assertEquals(2,o2.getHandlerCode().intValue());

        OrderEntity o3 = orderService.selectByShardingColumn(3);
        Assert.assertEquals(3,o3.getHandlerCode().intValue());

        OrderEntity o4 = orderService.selectByShardingColumn(4);
        Assert.assertEquals(4,o4.getHandlerCode().intValue());
    }

    @Test
    void selectByShardingColumns() {
        List<Integer> handlerCodes = Arrays.asList(1, 2, 3, 4);
        List<OrderEntity> list = orderService.selectByShardingColumns(handlerCodes);
        Assert.assertEquals(4,list.size());
    }

    /**
     * 测试 多个字段同时in 的情况
     */
    @Test
    void selectByShardingColumnsAndIds() {
        List<Integer> handlerCodes = Arrays.asList(2,6,1,5);
        List<Long> ids = Arrays.asList(434436544632193024L,432637498665992192L,434436373387149312L,1L);
        List<OrderEntity> list = orderService.selectByShardingColumnsAndIds(handlerCodes,ids);
        Assert.assertEquals(4,list.size());
    }

    @Test
    void selectAllAboutTable() {
        Map map = orderService.selectAllAboutTable(1);
        System.out.println(map);
    }

    @Test
    void selectAllTable() {
        Map map = orderService.selectAllTable(1);
        System.out.println(map);
    }

    /**
     * 测试分表查询limit 数量时 处理方式
     * 会全路由
     * @param
     * @author Hancher
     * @date  2020年02月13日  15:45
     * @since 1.0
     * @return
     */
    @Test
    void selectAllTableLimit() {
        Map map = orderService.selectAllTableLimit(0L);
        System.out.println(map);
    }

    @Test
    void seleteLevelByCode() {

    }

    @Test
    void createLevel(){
//        OrderLevelEntity orderLevelEntity = new OrderLevelEntity();
//        orderLevelEntity.setLevel(1);
//        orderLevelEntity.setLevelCode("100");
//        orderLevelEntity.setLevelName("一级");
//        orderService.createLevel(orderLevelEntity);
        OrderLevelEntity orderLevelEntity = new OrderLevelEntity();
        orderLevelEntity.setLevel(2);
        orderLevelEntity.setLevelCode("100100");
        orderLevelEntity.setLevelName("二级");
        orderService.createLevel(orderLevelEntity);
    }
}