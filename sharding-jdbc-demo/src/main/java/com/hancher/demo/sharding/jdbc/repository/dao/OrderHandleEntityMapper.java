package com.hancher.demo.sharding.jdbc.repository.dao;

import com.hancher.demo.sharding.jdbc.repository.entity.OrderHandleEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHandleEntityMapper {
    int insert(OrderHandleEntity record);

    int insertSelective(OrderHandleEntity record);
}