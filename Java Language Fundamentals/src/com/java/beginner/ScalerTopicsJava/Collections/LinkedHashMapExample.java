package com.java.beginner.ScalerTopicsJava.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(16,"Virat");
        linkedHashMap.put(1,"Alex");
        linkedHashMap.put(40,"Ishika");
        linkedHashMap.put(5,"Sonu");
        linkedHashMap.put(3,"Mrinalini");
        linkedHashMap.put(38,"John");
        System.out.println(linkedHashMap);
        for (Map.Entry<Integer,String> entry: linkedHashMap.entrySet()){
            System.out.println("Key : "+entry.getKey()+"  ,Value : "+entry.getValue());
        }
    }
}
