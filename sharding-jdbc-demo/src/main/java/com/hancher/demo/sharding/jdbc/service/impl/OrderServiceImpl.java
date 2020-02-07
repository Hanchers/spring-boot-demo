package com.hancher.demo.sharding.jdbc.service.impl;

import com.hancher.demo.sharding.jdbc.repository.dao.OrderEntityMapper;
import com.hancher.demo.sharding.jdbc.repository.dao.OrderHandleEntityMapper;
import com.hancher.demo.sharding.jdbc.repository.dao.OrderHandleRecordEntityMapper;
import com.hancher.demo.sharding.jdbc.repository.dao.OrderLevelEntityMapper;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderEntity;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderHandleEntity;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderHandleRecordEntity;
import com.hancher.demo.sharding.jdbc.repository.entity.OrderLevelEntity;
import com.hancher.demo.sharding.jdbc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderEntityMapper orderEntityMapper;

    @Autowired
    private OrderHandleEntityMapper orderHandleEntityMapper;

    @Autowired
    private OrderHandleRecordEntityMapper orderHandleRecordEntityMapper;

    @Autowired
    private OrderLevelEntityMapper orderLevelEntityMapper;

    @Override
    @Transactional
    public int createOrder(OrderEntity order) {
        return orderEntityMapper.insertSelective(order);
    }

    @Override
    @Transactional
    public int createOrderWithHandle(OrderEntity order, OrderHandleEntity handler, OrderHandleRecordEntity record) {
        orderEntityMapper.insertSelective(order);
        orderHandleEntityMapper.insertSelective(handler);
        orderHandleRecordEntityMapper.insertSelective(record);
        return 1;
    }

    @Override
    public int updateOrder(OrderEntity order) {
        return 0;
    }

    @Override
    public int deleteOrder(OrderEntity order) {
        return orderEntityMapper.deleteByIdAndHandler(order.getId(),order.getHandlerCode());
    }

    @Override
    public int deleteOrderById(Long id) {
        return orderEntityMapper.deleteById(id);
    }

    @Override
    public OrderEntity selectByShardingColumn(Integer handlerCode) {
        return orderEntityMapper.selectByHandlerCode(handlerCode);
    }

    @Override
    public List<OrderEntity> selectByShardingColumns(List<Integer> handlerCodes) {
        return orderEntityMapper.selectByHandlerCodes(handlerCodes);
    }

    @Override
    public Map selectAllAboutTable(Integer handlerCode) {
        return orderEntityMapper.selectAllAboutTable(handlerCode);
    }

    @Override
    public Map selectAllTable(Integer handlerCode) {
        return orderEntityMapper.selectAllTable(handlerCode);
    }

    @Override
    public OrderLevelEntity seleteLevelByCode(Integer code) {
        return null;
    }

    @Override
    public void createLevel(OrderLevelEntity orderLevelEntity) {
        orderLevelEntityMapper.insertSelective(orderLevelEntity);
    }
}
