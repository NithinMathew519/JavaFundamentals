package com.java.beginner.GettingStarted.LoopingAndArrays;

public class doWhileLoop {
    public static void main(String[] args) {
        int ival=80;
        do {
            System.out.print(ival);
            System.out.print("* 2 = ");
            ival*=2;
            System.out.println(ival);
        }while (ival<25);
    }
}
