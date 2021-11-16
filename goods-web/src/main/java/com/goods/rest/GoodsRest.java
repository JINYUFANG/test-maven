package com.goods.rest;

import com.goods.api.GoodsApi;
import com.goods.dto.GoodsDto;
import com.goods.mapper.GoodsMapper;
import com.goods.service.GetGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsRest implements GoodsApi {

    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    GetGoodsService getGoodsService;

    @Override
    public GoodsDto getGoodsDto(@RequestParam(value = "id") String id){

        GoodsDto g=goodsMapper.entityToDto(getGoodsService.findById(id));
        return g;
    }
}