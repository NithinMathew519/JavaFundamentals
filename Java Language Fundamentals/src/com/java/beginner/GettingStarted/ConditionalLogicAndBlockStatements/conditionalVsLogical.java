package com.java.beginner.GettingStarted.ConditionalLogicAndBlockStatements;

public class conditionalVsLogical {
    public static void main(String[] args) {
        int students = 150;
        int rooms = 0;

        if (rooms != 0 && students / rooms > 30)
            System.out.println("Crowded");
        else if (rooms==0 && students > 30) {
            System.out.println("Rooms not Available");
        }
        else
            System.out.println("No rooms and students are available");
    }
}
