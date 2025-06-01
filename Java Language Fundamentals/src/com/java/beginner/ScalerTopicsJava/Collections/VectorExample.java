package com.java.beginner.ScalerTopicsJava.Collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(4,4);
        vector.add(10);
        vector.add(20);
        vector.add(9);
        vector.add(1);
        System.out.println("Vector Size : "+vector.size());
        System.out.println("Vector Capacity : "+vector.capacity());
        vector.add(5);
        vector.add(50);
        System.out.println("Vector Size : "+vector.size());
        System.out.println("Vector Capacity : "+vector.capacity());
        while(!vector.isEmpty()){
            System.out.print(vector.remove(0)+ "  " );
        }
    }
}
