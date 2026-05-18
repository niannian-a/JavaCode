package com.xzy.www.DuoTai;

public class Test {
    public static void main(String[] args) {
        Person per = new Person();
        per.name="wang";
        per.age=16;
        per.gender="男";

        Vehicle vehicle=new Car();
        vehicle.brand="huawei";
        vehicle.speed=200;
        per.drive(vehicle);

        Vehicle vehicle2=new Bike();
        vehicle2.brand="xiaomi";
        vehicle2.speed=17;
        per.drive(vehicle2);


    }
}
