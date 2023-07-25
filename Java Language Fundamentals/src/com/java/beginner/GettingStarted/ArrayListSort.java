package com.java.beginner.GettingStarted;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort{
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<Integer>();
       for (int i=1;i<=100;i++){
           list.add((int) (Math.random()*100));
       }
        Collections.sort(list);
       System.out.println(list);
    }
//public static void main(String[] args) {
//    int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
//    Arrays.sort(arr);
//    System.out.printf(Arrays.toString(arr));
//}


}


