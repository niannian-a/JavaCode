package com.xzy.www;
import static java.lang.Math.max;

public class StringCalculate {
    public static void main(String[] args) {
        String str1 = "99999999999999999999";
        String str2 = "99999999999999999999999";
        //求最大长度
        int maxlength = max(str1.length(), str2.length());//5

        //求补零个数
        int addzero2 = maxlength-str2.length()+1;//2
        for (int i = 0; i < addzero2; i++) {
            str2 = "0" + str2;
        }
        int addzero1 = maxlength-str1.length()+1;//2
        for (int i = 0; i < addzero1; i++) {
            str1 = "0" + str1;
        }
        System.out.println(str1);
        System.out.println(str2);
        int[] arr1=StringToInt(str1);
        int[] arr2=StringToInt(str2);
        int count=0;
        String strsum="";
        for (int i = maxlength; i >= 0; i--) {
            if(arr1[i]+arr2[i]+count>9){//进位
                int num=arr1[i]+arr2[i]+count-10;
                count=1;
                strsum=num+strsum;
            }else{//不进位
                int num=arr1[i]+arr2[i]+count;
                count=0;
                strsum=num+strsum;
            }
        }
        if(strsum.charAt(0)=='0'){
            strsum=strsum.substring(1);
        }
        System.out.println(strsum);


    }
    public static int[] StringToInt(String str){
        int[] arr=new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i]=str.charAt(i)-48;
        }
     return arr;
    }

}
