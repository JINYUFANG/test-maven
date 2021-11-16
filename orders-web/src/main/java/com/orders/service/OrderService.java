package com.orders.service;


import com.goods.api.GoodsApi;
import com.goods.dto.GoodsDto;
import com.orders.dao.OrdersDao;
import com.orders.entity.Orders;
import com.orders.mapper.OrdersMapper;
import com.orders.service.dto.OrdersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService {
    private static final Map<String, Orders> ORDER_DATA = new HashMap<String, Orders>();

    @Autowired
    GoodsApi goodsApi;

    @Autowired
    OrdersMapper ordersMapper;

    @Autowired
    OrdersDao ordersDao;

    /**
     * 根据订单id查询订单数据
     *
     * @param id
     * @return
     */
    public OrdersDto getOrderById(String id) {
        Orders orders = ordersDao.findById(id);
        if (null == orders) {
            return null;
        }
        // 通过商品微服务查询商品详细数据
        GoodsDto goodsDto = goodsApi.getGoodsDto(orders.getGoodsId());
        OrdersDto ordersDto= ordersMapper.entityToDto(orders);
        ordersDto.setName(goodsDto.getName());
        ordersDto.setAdvicePrice(goodsDto.getAdvicePrice());
        ordersDto.setUnit(goodsDto.getUnit());
        return ordersDto;
    }
}