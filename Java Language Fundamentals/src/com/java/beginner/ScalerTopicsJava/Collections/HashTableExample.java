package com.java.beginner.ScalerTopicsJava.Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(16,"Virat");
        ht.put(1,"Alex");
        ht.put(40,"Ishika");
        ht.put(5,"Sonu");
        ht.put(3,"Mrinalini");
        ht.put(38,"John");
        for(Map.Entry<Integer,String> entry: ht.entrySet()){
            System.out.println("Key : "+entry.getKey()+" ,Value : "+entry.getValue());
        }
    }
}
