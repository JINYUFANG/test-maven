package com.goods.entity;

public class Goods {

    private String id;
    private String name;
    private String ramark;//备注
    private double costPrice;//成本价
    private double advicePrice;//建议价
    private int num;//存量
    private String unit;//单位
    public Goods(){}

    public Goods(String id, String name, String ramark, double costPrice, double advicePrice, int num, String unit) {
        this.id = id;
        this.name = name;
        this.ramark = ramark;
        this.costPrice = costPrice;
        this.advicePrice = advicePrice;
        this.num = num;
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

    public String getRamark() {
        return ramark;
    }

    public void setRamark(String ramark) {
        this.ramark = ramark;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getAdvicePrice() {
        return advicePrice;
    }

    public void setAdvicePrice(double advicePrice) {
        this.advicePrice = advicePrice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}