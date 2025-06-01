package com.java.beginner.ScalerTopicsJava.Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxNum=sc.nextInt();
        for (int i=1;i<=maxNum;i++){
            System.out.println(i);
        }
        sc.close();
    }
}
