package com.xzy.www.OOPExtendsDesign;

public class Test {
    public static void main(String[] args) {
        Android android=new Android();
        android.brand="HUAWEI";
        android.price=1000;
        android.call();
        android.sendMessage();
        android.nfc();

        IOS ios=new IOS();
        ios.brand="APPLE";
        ios.price=5000;
        ios.call();
        ios.sendMessage();

        Laptop laptop=new Laptop();
        laptop.brand="Zhengjiuzhe";
        laptop.price=2000;
        laptop.coding();
    }
}
