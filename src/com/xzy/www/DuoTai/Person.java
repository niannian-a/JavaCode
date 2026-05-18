package com.xzy.www.DuoTai;

public class Person {
    String name;
    int age;
    String gender;

    public void drive(Vehicle vehicle){
        vehicle.move();
        if(vehicle instanceof Bike){
            Bike bike = (Bike)vehicle;
            bike.ringBell();
        }else {
            Car car = (Car) vehicle;
            car.honk();
        }

    }

    public Person() {
    }
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
