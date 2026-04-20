package com.xzy.www.OOPkongcangouzao;

public class Student {
    private String name;
    private int age;
    private double height;
    private double weight;

    public void study(){
        System.out.println(name+" is studying");
    }
//全参
    public Student(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

//空参
    public String getName() {
        return name;
    }
//set and get

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
