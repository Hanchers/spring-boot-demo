package com.hancher.demo.sharding.jdbc.repository.dao;

import com.hancher.demo.sharding.jdbc.repository.entity.OrderLevelEntity;

public interface OrderLevelEntityMapper {
    int insert(OrderLevelEntity record);

    int insertSelective(OrderLevelEntity record);
}