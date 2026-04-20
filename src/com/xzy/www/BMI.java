package com.xzy.www;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        //定义类
        Scanner sc=new Scanner(System.in);
        //定义身高
        double height = sc.nextDouble();
        System.out.println("The height is "+height);
        //定义体重
        double weight = sc.nextDouble();
        System.out.println("The weight is "+weight);
        //定义BMI
        double bmi = weight / (height * height);
        System.out.println("The bmi is "+bmi);
    }
}
