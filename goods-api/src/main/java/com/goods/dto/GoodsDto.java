package com.goods.dto;

public class GoodsDto {

    private String id;
    private String name;
    private double advicePrice;
    private String unit;//单位
    public GoodsDto(){}
    public GoodsDto(String id, String name, double advicePrice, String unit) {
        this.id = id;
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