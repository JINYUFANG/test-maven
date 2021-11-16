package com.goods.service.impl;

import com.goods.dao.GoodsDao;
import com.goods.entity.Goods;
import com.goods.service.GetGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GetGoodsServiceImpl implements GetGoodsService {


    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods findById(String id) {
        return goodsDao.findByGoodsId(id);
    }
}
