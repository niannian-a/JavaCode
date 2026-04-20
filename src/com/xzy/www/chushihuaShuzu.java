package com.xzy.www;
import java.util.Scanner;
public class chushihuaShuzu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("input " + (i + 1) + " number");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
        }
    }
}
