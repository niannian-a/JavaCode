package com.xzy.www;

public class FindNumberMax {
    public static void main(String[] args) {
        int arr[]={33,5,22,44,55};
        int max=0;
        for (int i = 0; i < 5; i++) {
            if (arr[i]>max){
                max=arr[i];
            }else{

            }
            System.out.println(max);
        }
        System.out.println("The max number is "+max);
    }
}
