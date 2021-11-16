package com.goods.service;

import com.goods.entity.Goods;

public interface GetGoodsService {

    Goods findById(String id);
}
