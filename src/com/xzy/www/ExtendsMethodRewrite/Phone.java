package com.xzy.www.ExtendsMethodRewrite;

public class Phone {
    String name;
    public void call(){
        System.out.println(name+" can call!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }
}
