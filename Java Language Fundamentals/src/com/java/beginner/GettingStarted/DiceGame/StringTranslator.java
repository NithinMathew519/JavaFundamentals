package com.java.beginner.GettingStarted.DiceGame;

import java.util.Scanner;

public class StringTranslator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Initialize variables
        int total_Strings = 0;
        int total_Characters = 0;

        // Start an infinite loop to continuously take user input
        while (true) {
            // Prompt the user for a command (upper, lower, mixed)
            System.out.print("Enter a command (upper, lower, mixed): ");
            String command = scan.nextLine().trim();

            // Check if the user entered "quit" to exit the program
            if (command.equalsIgnoreCase("quit")) {
                break;
            } else if (!isValidCommand(command)) { // Check if the command is valid
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }

            // Prompt the user for a string input
            System.out.print("Enter a string: ");
            String Input_String = scan.nextLine().trim();

            // Check if the input string has at least one character
            if (Input_String.length() == 0) {
                System.out.println("String should have at least one character. Please try again.");
                continue;
            }

            // Translate the input string based on the given command
            String result = translate_String(Input_String, command);
            System.out.println("Translated string: " + result);

            // Update the counts of strings and characters
            total_Strings++;
            total_Characters += Input_String.length();
        }

        // Display the total number of strings and characters
        System.out.println("Total strings : " + total_Strings);
        System.out.println("Total number of characters : " + total_Characters);

        scan.close();
    }

    // Method to check if the command is valid (upper, lower, mixed)
    private static boolean isValidCommand(String command) {
        return command.equalsIgnoreCase("upper") || command.equalsIgnoreCase("lower")
                || command.equalsIgnoreCase("mixed");
    }

    // Method to translate the input string based on the command
    private static String translate_String(String input, String command) {
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = true;

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            if (toUpperCase) {
                result.append(command.equalsIgnoreCase("lower") ? Character.toLowerCase(c) : Character.toUpperCase(c));
            } else {
                result.append(command.equalsIgnoreCase("upper") ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }
            toUpperCase = !toUpperCase;
        }
        return result.toString();
    }
}