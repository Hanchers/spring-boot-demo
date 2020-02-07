package com.hancher.demo.sharding.jdbc.repository.dao;

import com.hancher.demo.sharding.jdbc.repository.entity.OrderHandleRecordEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHandleRecordEntityMapper {
    int insert(OrderHandleRecordEntity record);

    int insertSelective(OrderHandleRecordEntity record);
}