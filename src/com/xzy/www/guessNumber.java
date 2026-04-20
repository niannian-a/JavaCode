package com.xzy.www;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);
        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();
            if (input > number) {
                System.out.println("大了");
                continue;
            } else if (input < number) {
                System.out.println("小了");
                continue;
            }
            System.out.println("正确");
            break;
        }

    }
}
