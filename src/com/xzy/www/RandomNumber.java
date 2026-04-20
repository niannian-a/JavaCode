package com.xzy.www;

import java.util.Random;

public class RandomNumber {
    //打乱数组数据
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            int temp = arr[number1];
            arr[number1]=arr[number2];
            arr[number2]=temp;
        }
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
