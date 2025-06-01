package com.java.beginner.ScalerTopicsJava.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Define Set A
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        System.out.print("Set A : "+setA);
        System.out.println();
        // Define Set B
        Set<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        System.out.print("Set B : "+setB);
        System.out.println();
        // Intersection: elements common to both sets
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection of A and B: " + intersection);

        // Union: all elements from both sets
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union of A and B: " + union);

        // Complement of A relative to B (elements in B but not in A)
        Set<Integer> complement = new HashSet<>(setB);
        complement.removeAll(setA);
        System.out.println("Complement of A relative to B (B - A): " + complement);

        // Complement of B relative to A (elements in A but not in B)
        Set<Integer> complement1=new HashSet<>(setA);
        complement1.removeAll(setB);
        System.out.println("Complement of B relative to A (A - B): "+complement1);
    }
}
