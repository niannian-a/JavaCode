package com.xzy.www.OOPGetandSet;

public class Dog {
    private  String name;
    private  int age;
    private  String color;

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
        if(age>0&&age<15){
            this.age = age;
        }else {
            System.out.println("age must be between 0 and 15");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String C) {
        color = C;
    }
}
