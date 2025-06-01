package com.java.beginner.ScalerTopicsJava.Collections;

import java.awt.*;
import java.security.Key;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
//        Map<Integer,Double> m=new HashMap<>();
//        m.put(10,20.0);
//        m.put(20,30.0);
//        m.put(10,30.0);
//        System.out.println(m);
//        m.remove(10);
//        System.out.println(m);
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(16,"Virat");
        hashMap.put(1,"Alex");
        hashMap.put(40,"Ishika");
        hashMap.put(5,"Sonu");
        hashMap.put(3,"Mrinalini");
        hashMap.put(38,"John");
        System.out.println(hashMap);
    }
}
