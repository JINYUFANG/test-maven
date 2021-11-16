package com.orders.entity;


import java.util.Date;

public class Orders {
    private String id;

    private Date date;//订单创建日期

    private String address;

    private String goodsId;

    private int saleNum;//销售数量

    public Orders() {

    }

    public Orders(String id, Date date, String address, String goodsId, int saleNum) {
        this.id = id;
        this.date = date;
        this.address = address;
        this.goodsId = goodsId;
        this.saleNum = saleNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }
}