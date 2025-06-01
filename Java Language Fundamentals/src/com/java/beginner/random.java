package com.java.beginner;

import java.util.*;

public class random {

    void hi(){
        System.out.println("hi");
    }
    static void Hello(){
        System.out.println("Hello");
//        random.hi();
//        java: non-static method hi() cannot be referenced from a static context
    }
    public static void main(String[] args) {
        Hello();
        random hii=new random();
        hii.hi();
    }
}
