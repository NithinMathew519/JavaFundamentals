package com.java.beginner.GettingStarted.UnderstandingMethods;

import java.util.Arrays;

public class InterestArray {
    static double[] produceInterestArray(double amt, double rate, int years) {
        double[] accumulationInterest = new double[years];
        for (int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumulationInterest[yearIndex] = calculateInterest(amt, rate, year);
        }
        return accumulationInterest;
    }

    private static double calculateInterest(double amt, double rate, int year) {
        return amt * rate * year;
    }

    public static void main(String[] args) {

        double[] result = produceInterestArray(1000,0.05,5);

        // Print the accumulated interest for each year
        for (int yearIndex = 0; yearIndex < result.length; yearIndex++) {
            int year = yearIndex + 1;
            System.out.printf("Year %d: %.2f%n", year, result[yearIndex]);
        }
    }
}
