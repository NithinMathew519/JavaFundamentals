package com.java.beginner.GettingStarted.LoopingAndArrays;

public class whileLoop {
    public static void main(String[] args) {
//        factorial of a number Example
        int someValue=4;
        int factorial=1;
        while (someValue>1){
            factorial*=someValue;
            someValue--;
        }
        System.out.println(factorial);
    }
}
