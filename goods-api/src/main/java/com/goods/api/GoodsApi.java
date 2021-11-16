package com.goods.api;


import com.goods.dto.GoodsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/api/")
public interface GoodsApi {

    @GetMapping("/getGoodsDto")
    GoodsDto getGoodsDto(@RequestParam(value = "id") String id);  //@RequestParam:用于将请求参数区域的数据映射到控制层方法的参数上

}