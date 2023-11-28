package com.java.beginner.GettingStarted.DiceGame;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DiceHILO {
    private static Scanner scanner = new Scanner(System.in);
    private static String username;
    private static int tries = 0;
    private static int successes = 0;
    private static int lastRoll;



    // Method to get the user's username
    private static void get_UserName() {
        System.out.println("Please enter your username:");
        username = scanner.nextLine();
    }

    // Method to check if a file exists for the user
    private static boolean file_Exists(String username) {
        File file = new File(username + ".txt");
        return file.exists();
    }

    // Method to read the user's data from a file
    private static void read_User_Data() {
        try {
            Scanner fileScanner = new Scanner(new File(username + ".txt"));
            successes = fileScanner.nextInt();
            tries = fileScanner.nextInt();
            fileScanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to play the game
    private static void start_the_Game() {
        System.out.println("Let's play the Hi-Lo game. Please Type 'quit' to exit the game.");
        lastRoll = roll_the_Dice();
        System.out.println(lastRoll+"  This is the Initial roll value  ");

        while (true) {
            System.out.println("Will the next roll be higher or lower (h/l)?");
            String guess = scanner.nextLine();

            if (guess.equalsIgnoreCase("quit")) {
                break;
            }

            int nextRoll = roll_the_Dice();
            System.out.println("Next roll: " + nextRoll);

            if (game_Prediction(guess, lastRoll, nextRoll)) {
                System.out.println("Correct!");
                successes++;
            } else {
                System.out.println("Incorrect.");
            }

            tries++;
            lastRoll = nextRoll;
        }
    }

    // Method to roll a 6-sided dice
    private static int roll_the_Dice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Method to determine if the user's guess is correct
    private static boolean game_Prediction(String guess, int lastRoll, int nextRoll) {
        if (guess.equalsIgnoreCase("h")) {
            return nextRoll > lastRoll;
        } else if (guess.equalsIgnoreCase("l")) {
            return nextRoll < lastRoll;
        }
        return false;
    }

    // Method to save user data to a file
    private static void save_User_Data() {
        try {
            FileWriter fileWriter = new FileWriter(username + ".txt");
            fileWriter.write(successes + "\n" + tries);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to display the result
    private static void show_the_Result() {
        System.out.println("Game over. You had " + successes + " successful tries out of " + tries + " total tries.");
        if (tries > 0) {
            double successRatio = (double) successes / tries;
            System.out.println("Success Ratio: " + String.format("%.2f", successRatio * 100) + "%");
        } else {
            System.out.println("No tries recorded.");
        }
    }
    public static void main(String[] args) {
        // Step 1: Get the user's username
        get_UserName();

        // Step 2: Check if a file for this user exists
        if (file_Exists(username)) {
            // Step 3: Read the previous data
            read_User_Data();
        }

        // Step 4: Start the game
        start_the_Game();

        // Step 5: Save the user's data
        save_User_Data();

        // Step 6: Show the result
        show_the_Result();
    }
}