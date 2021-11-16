package com.goods.controller;


import com.goods.entity.Goods;
import com.goods.service.GetGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/goods")
public class GoodsController {

    @Autowired
    private GetGoodsService getGoodsService;

    /**
     * 对外提供接口服务，查询商品信息
     *
     * @param id
     * @return
     */
    @GetMapping(value="/getGoodsById")
    public Goods getGoodsById(@RequestParam(value="id") String id){
        Goods goods= getGoodsService.findById(id);
        return goods;
    }
}