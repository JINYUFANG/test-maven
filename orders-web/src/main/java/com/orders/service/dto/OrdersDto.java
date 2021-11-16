package com.orders.service.dto;


import java.util.Date;

public class OrdersDto {
    private String id;

    private Date date;

    private String address;

    private int saleNum;

    private String goodsId;

    private String name;

    private double advicePrice;

    private String unit;//单位


    public OrdersDto(){}

    public OrdersDto(String id, Date date, String address, int saleNum, String goodsId, String name, double advicePrice, String unit) {
        this.id = id;
        this.date = date;
        this.address = address;
        this.saleNum = saleNum;
        this.goodsId = goodsId;
        this.name = name;
        this.advicePrice = advicePrice;
        this.unit = unit;
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

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAdvicePrice() {
        return advicePrice;
    }

    public void setAdvicePrice(double advicePrice) {
        this.advicePrice = advicePrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}