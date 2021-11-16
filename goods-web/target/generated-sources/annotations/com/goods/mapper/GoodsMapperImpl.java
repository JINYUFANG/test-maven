package com.goods.mapper;

import com.goods.dto.GoodsDto;
import com.goods.entity.Goods;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-25T22:44:06+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_152 (Oracle Corporation)"
)
@Component
public class GoodsMapperImpl extends GoodsMapper {

    @Override
    public GoodsDto entityToDto(Goods entity) {
        if ( entity == null ) {
            return null;
        }

        GoodsDto goodsDto = new GoodsDto();

        goodsDto.setId( entity.getId() );
        goodsDto.setName( entity.getName() );
        goodsDto.setAdvicePrice( entity.getAdvicePrice() );
        goodsDto.setUnit( entity.getUnit() );

        return goodsDto;
    }

    @Override
    public Goods dtoToEntity(GoodsDto dto) {
        if ( dto == null ) {
            return null;
        }

        Goods goods = new Goods();

        goods.setId( dto.getId() );
        goods.setName( dto.getName() );
        goods.setAdvicePrice( dto.getAdvicePrice() );
        goods.setUnit( dto.getUnit() );

        return goods;
    }
}
