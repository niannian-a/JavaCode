package com.xzy.www;

import java.util.Scanner;

public class method {
    //调用method getsum求和
    public static int getsum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        a=sc.nextInt();
        System.out.println("input b");
        b=sc.nextInt();
        int sum=getsum(a,b);
        System.out.println("和为"+sum);
    }
}
