package com.java.beginner.ScalerTopicsJava.Arrays;

public class MaxArray {
    public static int MaximumArray(int[] arr) {
        int Max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(Max<arr[i]){
                Max=arr[i];
            }
        }
        return Max;
    }

    public static void main(String[] args) {
        int myArr[]={11,21,10,51,80,100};
//        int maxNumber=MaximumArray(myArr);
        System.out.println("The Maximum Number is : "+MaximumArray(myArr));
    }
}
