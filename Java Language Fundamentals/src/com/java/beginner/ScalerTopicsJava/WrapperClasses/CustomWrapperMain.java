package com.java.beginner.ScalerTopicsJava.WrapperClasses;

public class WrapperMain extends CustomWrapperClasses{
    public WrapperMain(int x, int y) {
        super(x, y);
    }

//    public static void main(String[] args) {
//        CustomWrapperClasses cw = new CustomWrapperClasses(10, 20);
//        System.out.println(cw);
//    }
    public static void main(String[] args) {
        WrapperMain obj = new WrapperMain(10, 20); // Here, you are creating an object of your custom wrapper class and adding values to it.
        System.out.println(obj.getX());
        System.out.println(obj.getY());
    }
}
//Q: Which package is wrapper class?
//A: The wrapper class in Java package is java.lang.
//
//Q: How many wrapper classes are there in Java?
//A: There are eight wrapper classes in Java.