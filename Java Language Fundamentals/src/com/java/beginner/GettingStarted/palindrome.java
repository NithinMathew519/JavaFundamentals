package com.java.beginner.GettingStarted;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String strOriginal,strReverse="";
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the String : ");
        strOriginal= a.next();
        int len=strOriginal.length();
        for (int i=len-1;i>=0;i--)
            strReverse=strReverse+strOriginal.charAt(i);
        if(strOriginal.equals(strReverse)){
            System.out.println("Palindrome");}
        else{
            System.out.println("Not a Palindrome");}
    }
}
