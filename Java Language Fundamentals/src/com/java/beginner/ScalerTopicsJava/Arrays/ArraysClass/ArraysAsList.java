package com.java.beginner.ScalerTopicsJava.Arrays.ArraysClass;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysAsList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n= sc.nextInt();

        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> arrList=Arrays.asList(arr);
        System.out.println(arrList.stream().sorted().collect(Collectors.toList()));
        sc.close();
    }
}
