package com.xzy.www.InnerClass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("奥迪",1,"白");
        Car.Engine engine = car.new Engine("发动机1","耐用牌发动机",10);
        System.out.println("汽车品牌："+car.getBrand()+"， 车龄："+car.getUseTime()+"年， 颜色："+car.getColor());
        System.out.println("发动机名称："+engine.getName()+"， 品牌："+engine.getBrand()+"， 使用年限："+engine.getLimitTime()+"年");
    }
}
