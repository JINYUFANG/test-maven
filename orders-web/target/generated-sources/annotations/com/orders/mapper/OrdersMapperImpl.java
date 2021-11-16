package com.orders.mapper;

import com.orders.entity.Orders;
import com.orders.service.dto.OrdersDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-25T23:23:56+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_152 (Oracle Corporation)"
)
@Component
public class OrdersMapperImpl extends OrdersMapper {

    @Override
    public OrdersDto entityToDto(Orders entity) {
        if ( entity == null ) {
            return null;
        }

        OrdersDto ordersDto = new OrdersDto();

        ordersDto.setId( entity.getId() );
        ordersDto.setDate( entity.getDate() );
        ordersDto.setAddress( entity.getAddress() );
        ordersDto.setSaleNum( entity.getSaleNum() );
        ordersDto.setGoodsId( entity.getGoodsId() );

        return ordersDto;
    }

    @Override
    public Orders dtoToEntity(OrdersDto dto) {
        if ( dto == null ) {
            return null;
        }

        Orders orders = new Orders();

        orders.setId( dto.getId() );
        orders.setDate( dto.getDate() );
        orders.setAddress( dto.getAddress() );
        orders.setGoodsId( dto.getGoodsId() );
        orders.setSaleNum( dto.getSaleNum() );

        return orders;
    }
}
