package com.java.beginner.GettingStarted.ConditionalLogicAndBlockStatements;

public class conditionalLogicStatements {
    public static void main(String[] args) {
        int value1=7;
        int value2=8;
        int maxValue=value1>value2?value1:value2;
        System.out.println(maxValue);

//        if-else chaining
        if (value1>value2) {
            System.out.println("value 1 is bigger");
        } else if (value1==value2) {
            System.out.println("value 1 is equla to value 2");
        } else{
            System.out.println("value 2 is bigger");
        }
    }
}
