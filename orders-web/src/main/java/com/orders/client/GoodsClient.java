package com.orders.client;


import com.goods.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "goods" ,url = "localhost:8082")
public interface GoodsClient  extends GoodsApi {

}