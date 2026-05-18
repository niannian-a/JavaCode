package com.xzy.www.DuoTai;

public class Vehicle {
    String brand;
    double speed;

    public void move(){
        System.out.println("this vehicle is moving!");
    }

    public Vehicle() {
    }
    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
