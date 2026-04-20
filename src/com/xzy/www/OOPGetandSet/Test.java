package com.xzy.www.OOPGetandSet;

public class Test {
    public static void main(String[] args) {
        Dog getandSet=new Dog();
        getandSet.setAge(10);
        getandSet.setName("xzy");
        System.out.println(getandSet.getName());
        System.out.println(getandSet.getAge());
    }
}
