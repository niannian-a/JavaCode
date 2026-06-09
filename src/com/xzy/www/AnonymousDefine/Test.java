package com.xzy.www.AnonymousDefine;

public class Test {
    public static void main(String[] args) {
        Swim swim = new Swim(){
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        };
        goSwimming(swim);

    }
    public static void goSwimming(Swim s){
        s.swim();
    };
}
