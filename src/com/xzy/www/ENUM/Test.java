package com.xzy.www.ENUM;

public class Test {
    public static void main(String[] args) {
        //创建对象，获取订单状态
        OrderState o1 = OrderState.PAYMENT_PENDING;
        System.out.println(o1.getName());
        //匹配
        switch (o1) {
            case PAYMENT_PENDING:
                System.out.println("待支付");
                break;
            case PROCESSING:
                System.out.println("处理中");
                break;
            case SHIPPED:
                System.out.println("已发货");
                break;
            case DELIVERED:
                System.out.println("已送达");
                break;
            case OUT_FOR_DELIVERY:
                System.out.println("配送中");
                break;
            case CANCELLED:
                System.out.println("已取消");
        }
    }
}
