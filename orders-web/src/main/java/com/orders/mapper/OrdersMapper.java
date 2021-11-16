package com.orders.mapper;


import com.orders.entity.Orders;
import com.orders.service.dto.OrdersDto;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public abstract class OrdersMapper {


    public abstract OrdersDto entityToDto(Orders entity);
    /**
     * 将数据传输对象转换为实体。
     *
     * @param dto 数据传输对象。
     * @return 实体。
     */
    public abstract Orders dtoToEntity(OrdersDto dto);
}