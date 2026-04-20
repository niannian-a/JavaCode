package com.xzy.www;

import java.util.Scanner;

public class judgment1and10 {
    public static void main(String[] args) {
        //判断数字在1-10之间
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字");
        int input = sc.nextInt();
//        if (input >= 1 & input <= 10)
//            System.out.println("数字在1-10之间");
//        else
//            System.out.println("数字不在1-10之间");
        //判断数字不在1-10之间
        if (input<1|input>10)
            System.out.println("数字不在1-10之间");
        else
            System.out.println("数字在1-10之间");

    }
}
