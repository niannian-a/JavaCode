package com.xzy.www.ENUM;

public enum OrderState {
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    DELIVERED("已送达"),
    OUT_FOR_DELIVERY("配送中"),
    CANCELLED("已取消");

    private String name;

    OrderState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
