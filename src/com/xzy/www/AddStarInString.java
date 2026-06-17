package com.xzy.www;
import java.util.Scanner;

public class AddStarInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 =sc.next();
//        //A-Z 65-90 a-z 97-122
//        //0-9 48-57
//        //1bc786sjd90z8
//        // 1 b c 7 8 6 s j d 9 0  z  8
//        // 0 1 2 3 4 5 6 7 8 9 10 11 12
//        //0,1,3,6,9,11,12,13,
        String str2 = "A" + str1 + "A";
        System.out.println(str2);
        int length=str2.length();
        int[] arr=new int[length];
        int k=0;
        for (int i = 0; i < length-1; i++) {
            if(Match(str2.charAt(i),str2.charAt(i+1))){
                arr[k]=i+1;
                k++;
            }
        }
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        for (int i = 1; i < length; i++) {
            if(Belong(arr,i)){
                System.out.print("*");
                if(i!=length-1){
                    //不是最后一位
                    System.out.print(str2.charAt(i));
                }
            }else {
                if(i!=length-1){
                    //不是最后一位
                    System.out.print(str2.charAt(i));
                }
            }
        }
    }

    public static boolean Match(char p,char n){
        //A-Z 65-90 a-z 97-122
        //0-9 48-57
        //1bc786sjd90z8
        if(p<58)//数字
        {
            return n >= 58;
        }else {
            return n <= 58;
        }
    }
    public static boolean Belong(int[] arr,int a){
        int lengtharr=arr.length;
        for (int j = 0; j < lengtharr; j++) {
            if(a==arr[j]){
                return true;
            }
        }
        return false;
    }
}
