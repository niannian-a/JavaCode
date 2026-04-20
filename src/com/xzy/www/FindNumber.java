package com.xzy.www;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        int arr[]= {33, 5, 22, 44, 55, 33};
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        for (int j = 0; j < 6; j++) {
            System.out.print(arr[j]+" ");
        }
        for (int i = 0; i < 6; i++) {
            if(number==arr[i]){
                System.out.println("数字在数组的第"+(i+1)+"个");
                break;
            }else {
                if(i==5) {
                    System.out.println("数字不在数组内");
                    break;
                }
            }

        }
    }
}
