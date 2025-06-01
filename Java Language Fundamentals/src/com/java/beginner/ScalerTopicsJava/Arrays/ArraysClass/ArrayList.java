package com.java.beginner.ScalerTopicsJava.Arrays.ArraysClass;

import java.util.Arrays;
import java.util.List;

public class ArrayList<I extends Number> {
    public static void main(String args[]) {
        Integer arr[] ={ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,12,11 };
        Arrays.sort(arr);
        List<Integer> arrList= Arrays.asList(arr);
        Integer[] extendedArr = Arrays.copyOfRange(arr,2,9);
        System.out.println(arrList.toString()+"  "+Arrays.toString(extendedArr));
        System.out.println(Arrays.hashCode(arr));
        System.out.println(Arrays.hashCode(extendedArr));
    }
}
