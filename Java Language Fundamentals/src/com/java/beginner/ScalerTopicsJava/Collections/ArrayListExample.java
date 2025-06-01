package com.java.beginner.ScalerTopicsJava.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(21);
        System.out.println(arrayList);
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(15);
        System.out.println(list);
        List<Integer> linkedlist=new LinkedList<Integer>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(15);
        System.out.println(linkedlist);
        List<Integer>vector= new Vector<Integer>();
        vector.add(20);
        vector.add(40);
        vector.add(15);
        System.out.println(vector);
    }
//    1. Using the add Keyword
//    2. Using asList() AsList() method in Java is used to return a fixed-size list backed by the given array.
//    3. Using list.of() Method It is used to return immutable lists containing the specified elements.
//
}