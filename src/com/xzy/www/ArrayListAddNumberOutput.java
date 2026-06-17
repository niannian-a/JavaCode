package com.xzy.www;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAddNumberOutput {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字，输入-1结束");
        while(true){
            int i=sc.nextInt();
            if(i==-1){
                break;
            }else {
                boolean add = arrayList.add(i);
                if(add){
                    System.out.println("添加成功，继续输入");
                }else System.out.println("添加失败，请重新输入");
            }
        }
        System.out.println(arrayList);


    }
}
