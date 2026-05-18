package com.xzy.www.DuoTai;

public class Car extends Vehicle {
    public void honk(){
        System.out.println("this car is honking!");
    }
    @Override
    public void move(){
        System.out.println(getBrand()+" car is moving!");
        System.out.println("speed is "+getSpeed());
    }


}
