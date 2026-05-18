package com.xzy.www.DuoTai;

public class Bike extends Vehicle {
    public void ringBell(){
        System.out.println("this bike is ring it's bell!");
    }
    @Override
    public void move(){
        System.out.println(getBrand()+" bike is moving!");
        System.out.println("speed is "+getSpeed());
    }
}
