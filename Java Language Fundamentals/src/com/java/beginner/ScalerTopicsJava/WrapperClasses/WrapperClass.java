package com.java.beginner.ScalerTopicsJava.WrapperClasses;

public class WrapperClass {
    public static void main(String[] args) {

        // create primitive types
        int a = 5;
        double b = 5.65;

        //converts into wrapper objects
//        Integer aObj = Integer.valueOf(a);
//        Double bObj = Double.valueOf(b);
        Integer aObj = a;
        Double bObj = b;

        if(aObj instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }

        if(bObj instanceof Double) {
            System.out.println("An object of Double is created.");
        }
        // converts into primitive types
        int c = aObj.intValue();
        double d = bObj.doubleValue();

        System.out.println("The value of a: " + c);
        System.out.println("The value of b: " + d);
    }
}


