package com.goods.mapper;


import com.goods.dto.GoodsDto;
import com.goods.entity.Goods;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public abstract class GoodsMapper {

    public abstract GoodsDto entityToDto(Goods entity);
    /**
     * 将数据传输对象转换为实体。
     *
     * @param dto 数据传输对象。
     * @return 实体。
     */
    public abstract Goods dtoToEntity(GoodsDto dto);

}