package com.java.beginner.GettingStarted.ConditionalLogicAndBlockStatements;

public class conditionalVsLogical {
    public static void main(String[] args) {
        int students = 150;
        int rooms = 0;

        if (rooms != 0 && students / rooms > 30)
            System.out.println("Crowded");
    }
}
