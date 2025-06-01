package com.java.beginner.ScalerTopicsJava.Arrays.ArraysClass;

import java.security.Key;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindArrEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of elements : ");

        int n= sc.nextInt();
        Integer[] arr=new Integer[n];
        System.out.println("Enter the elements : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> arrList= Arrays.asList(arr);
        System.out.print("arrList : "+arrList);
        System.out.println();
        Collections.sort(arrList);
        System.out.print("Sorted List : "+arrList);
        System.out.print("Enter the Search element : ");
        int Key=sc.nextInt();
        System.out.println(Key + " found at index = " + Arrays.binarySearch(arr, Key));
    }
}
