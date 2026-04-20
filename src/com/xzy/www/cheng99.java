package com.xzy.www;

public class cheng99 {
    public static void main(String[] args) {
        //1*1=1
        //1*2=2 2*2=4
        //……
        //1*9=9 2*9=18
        //按照乘法表格式看出，一行为一个循环，一行内的每一列为内循环，内循环增长的数为第一个数，所以第一个数为内循环的j
        //故外循环的i为第二个数
        //故输出为 j+"*"+i+"="+i*j+"  "
        //第一次外循环 i=1 j=1 打印1*1=1 换行 j++后不满足条件 跳出内循环 i++
        //第二次外循环 i=2 j=1 打印1*2=2 不换行 j++后满足条件 i=2 j=2 打印2*2=4 换行 j++后不满足条件 跳出内循环
        //由此可得，换行条件为i=j，于是使用if语句控制换行
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
//                if(j==i){
//                    System.out.println(j+"*"+i+"="+i*j+"\t");
//                }else {
//                    System.out.print(j+"*"+i+"="+i*j+"  ");
//                }
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
