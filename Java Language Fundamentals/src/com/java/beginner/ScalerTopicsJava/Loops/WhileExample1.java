package com.java.beginner.ScalerTopicsJava.Loops;

import java.util.Scanner;

public class WhileExample1 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int factorial=1;
    int i=1;
//    while(i<=n){
//        factorial*=i;
//        i++;
//    }
    int temp=0;
    temp=n;
    while(temp!=0){
        factorial*=temp;
        temp--;
        System.out.println(temp);
    }
    System.out.println(factorial);
    }
}
