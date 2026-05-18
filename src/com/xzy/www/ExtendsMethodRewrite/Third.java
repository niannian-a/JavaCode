package com.xzy.www.ExtendsMethodRewrite;

public class Third extends Phone {
    @Override
    public void call(){
        System.out.println(name+" can call with video!");
    }

    public void playgame(){
        System.out.println(name+" can play games!");
    }

    public void message(){
        System.out.println(name+" can send messages!");
    }
}
