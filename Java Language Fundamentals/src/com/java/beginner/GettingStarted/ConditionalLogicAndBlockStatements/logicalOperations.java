package com.java.beginner.GettingStarted.ConditionalLogicAndBlockStatements;

public class logicalOperations {
    public static void main(String[] args) {
        int a = 20, b = 14, c = 5;
//        And &
        if (a > b & b > c)
            System.out.println("a is greater than b and c");

        boolean done = false;

//        negation
        if (!done)
            System.out.println("Keep Going");
    }
}
