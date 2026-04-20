package com.xzy.www;

import java.util.Random;

public class UniqueNumber {
    //从1-100选取数据到数组，要求不重复
    public static void main(String[] args) {
        Random random = new Random();
        int arr[]=new int[10];
        for (int i = 0; i < 10; ) {
            int number = random.nextInt(100)+1;
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(number==arr[j]){
                    count++;
                    break;
                }
            }
           if(count==0){
               arr[i]=number;
               i++;
           }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(arr[j]+" ");
        }
    }
}
