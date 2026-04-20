package com.xzy.www;
//导入包
import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        //定义类
        Scanner sc=new Scanner(System.in);
        //定义num1为int类型变量
        int num1 = sc.nextInt();
        System.out.println("The first number is "+num1);
        //定义num2为int类型变量
        int num2 = sc.nextInt();
        System.out.println("The second number is "+num2);
        //定义sum为int类型变量
        int sum=num1+num2;
        System.out.println("The sum is "+sum);
    }
}
