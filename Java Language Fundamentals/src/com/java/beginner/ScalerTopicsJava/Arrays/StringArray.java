package com.java.beginner.ScalerTopicsJava.Arrays;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Length of the String : ");
        int length= sc.nextInt();
        sc.nextLine();
        String[] arr=new String[length];
        System.out.println("Enter the String values in to the array : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }

        System.out.println("The String values are : ");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for (int i=0;i<arr.length;i++){
            String[] strArr={"Hello ! ",arr[i]," how"," are"," you ?"};
            for (int j=0;j<strArr.length;j++){
                System.out.print(strArr[j]);
            }
            System.out.println();
        }

    }
}
