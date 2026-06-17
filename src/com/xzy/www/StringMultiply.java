package com.xzy.www;

import java.util.Random;

public class StringMultiply {
//A-Z 65-90 a-z 97-122
//0-9 48-57
public static void main(String[] args) {
    String str="";
    Random r = new Random();
    char [] arr=new char[52];
    for (int i = 0; i < 26; i++) {
        arr[i]=(char)(i+97);
        System.out.print(arr[i]+" ");
    }
    for (int i = 26; i < 52; i++) {
        arr[i]=(char)(i+39);
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    char[] verification=new char[5];
    for (int i = 0; i < 4; i++) {
        verification[i]=arr[(r.nextInt(52))];
    }
    verification[4]=(char)(r.nextInt(10)+48);
//    for (int i = 0; i < 5; i++) {
//        System.out.print(verification[i]);
//    }
    int randomindex=r.nextInt(5);
    char temp=verification[randomindex];
    verification[randomindex]=verification[4];
    verification[4]=temp;
    for (int i = 0; i < 5; i++) {
        System.out.print(verification[i]);
    }


}
}
