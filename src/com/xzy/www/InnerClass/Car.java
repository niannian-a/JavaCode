package com.xzy.www.InnerClass;

public class Car {
    String brand;
    int useTime;
    String color;
    class Engine{
        String name;
        String brand;
        int limitTime;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getLimitTime() {
            return limitTime;
        }

        public void setLimitTime(int limitTime) {
            this.limitTime = limitTime;
        }

        public Engine(String name, String brand, int limitTime) {
            this.name = name;
            this.brand = brand;
            this.limitTime = limitTime;
        }

        public Engine() {
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getUseTime() {
        return useTime;
    }

    public void setUseTime(int useTime) {
        this.useTime = useTime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
    }

    public Car(String brand, int useTime, String color) {
        this.brand = brand;
        this.useTime = useTime;
        this.color = color;
    }
}

