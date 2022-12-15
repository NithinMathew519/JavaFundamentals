package com.java.beginner.GettingStarted;

public class prefixAndPostfix {
    public static void main(String[] args) {
        int someValue=10;
        System.out.println(++someValue);
        System.out.println(someValue);

        int someOtherValue=20;
        System.out.println(someOtherValue++);
        System.out.println(someOtherValue);

        int A=10;
        System.out.println(--A);
        System.out.println(A);

        int B=20;
        System.out.println(B--);
        System.out.println(B);

//        compound Assignment Operations
        int myValue=50;
        myValue-= 5;
        System.out.println(myValue);

        int myOtherValue=100;
        int val1=5;
        int val2=10;
        myOtherValue /= val1*val2;
        System.out.println(myOtherValue);
    }

}
