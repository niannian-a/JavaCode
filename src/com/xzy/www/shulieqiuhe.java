package com.xzy.www;

import java.util.Scanner;
//    for循环练习4-数列之和
//            描述
//    现在他想计算以下数列前n项的和：
//    S(n)=1 - 2 + 3 - 4+…
//    示例1：
//    输入：4
//    说明：S(4) =1-2+3-4=-2
//    输出：-2
public class shulieqiuhe {
    public static void main(String[] args) {
        System.out.println("输入项数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (Math.pow(-1, i + 1));
            System.out.println("第 " + i + " 项为" + i * (Math.pow(-1, i + 1)));
            System.out.println("第 " + i + " 项和为 " + sum);
        }
    }
}
