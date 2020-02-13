package com.hancher.demo.sharding.jdbc.repository.dao;

import com.hancher.demo.sharding.jdbc.repository.entity.OrderEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrderEntityMapper {
    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    int deleteById(Long id);
    int deleteByIdAndHandler(Long id,Integer handlerCode);

    OrderEntity selectByHandlerCode(Integer handlerCode);

    List<OrderEntity> selectByHandlerCodes(@Param("handlerCodes") List<Integer> handlerCodes);
    List<OrderEntity> selectByHandlerCodesAndIds(@Param("handlerCodes") List<Integer> handlerCodes
            ,@Param("ids") List<Long> ids);

    Map selectAllAboutTable(Integer handlerCode);

    ////关联表+配置表
    Map selectAllTable(Integer handlerCode);

    Map selectAllTableLimit(Long id);
}