package com.orders.dao;

import com.orders.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrdersDao {
    public Orders findById(String id);
}
