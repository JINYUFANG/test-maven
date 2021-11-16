package com.goods.dao;

import com.goods.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsDao {
    public Goods findByGoodsId(@Param("id") String id);
}
