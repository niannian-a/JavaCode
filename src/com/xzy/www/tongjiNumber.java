package com.xzy.www;

import java.util.Scanner;

//#### for循环算法案例1-统计满足条件的数字
//案例6：统计满足条件的数字
//需求：键盘录入两个数字，表示一个范围。
//统计这个范围中。
//既能被3整除，又能被5整除数字有多少个？
public class tongjiNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入左范围");
        int left = sc.nextInt();
        System.out.println("输入右范围");
        int right = sc.nextInt();
        System.out.println("范围是" + left + " - " + right);
        int sum = 0;
        for (int i = left; i <= right; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                sum++;
        }
        System.out.println("既能被3整除，又能被5整除数字有" + sum + "个");
    }
}
