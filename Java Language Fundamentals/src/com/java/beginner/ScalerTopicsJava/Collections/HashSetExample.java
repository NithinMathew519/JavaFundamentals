package com.java.beginner.ScalerTopicsJava.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(10);
        hs.add(5);
        hs.add(5);
        System.out.println(hs);

        LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(10);
        lhs.add(5);
        System.out.println(lhs);

        Set<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("USA");
        ts.add("Britain");

        //displaying the TreeSet
        System.out.println(ts);
    }
}
