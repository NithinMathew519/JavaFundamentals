package com.java.beginner.ScalerTopicsJava.Arrays;

import java.util.Scanner;

public class ArraysWithScanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length= sc.nextInt();

        int[] arr =new int[length];
        System.out.println("Insert the elements in to the array:");
        for(int i=0;i<length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The elements are : ");
        for (int i=0;i<length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
