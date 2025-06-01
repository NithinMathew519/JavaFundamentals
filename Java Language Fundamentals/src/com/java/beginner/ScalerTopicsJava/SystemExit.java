package com.java.beginner.ScalerTopicsJava;

public class SystemExit {
    public static void exampleMethod(int[] array1){
        for(int i=0;i< array1.length;i++){
            System.out.println(i);
            if(i>5){
                System.out.println("Terminating JVM.......");
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        int[] array1={0,4,6,8,10,12,14,16};
        SystemExit.exampleMethod(array1);
    }
}
