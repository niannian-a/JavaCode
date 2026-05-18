package com.xzy.www.ExtendsMethodRewrite;

public class Test {
    public static void main(String[] args) {
        First phone1=new First();
        phone1.name="第一代手机";
        phone1.call();

        Second phone2=new Second();
        phone2.name="第二代手机";
        phone2.call();
        phone2.message();

        Third phone3=new Third();
        phone3.name="第三代手机";
        phone3.call();
        phone3.message();
        phone3.playgame();

    }

}
