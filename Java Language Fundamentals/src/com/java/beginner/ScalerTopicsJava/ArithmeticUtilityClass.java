package com.java.beginner.ScalerTopicsJava;

public class ArithmeticUtilityClass {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int result = ArithmeticUtilityClass.add(3, 6);
// result is 9

        int result1 = ArithmeticUtilityClass.subtract(8, 2);
// result is 6

        int result2 = ArithmeticUtilityClass.multiply(5, 8);
// result is 40

        int result3 = ArithmeticUtilityClass.divide(20, 4);
// result is 5
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}


