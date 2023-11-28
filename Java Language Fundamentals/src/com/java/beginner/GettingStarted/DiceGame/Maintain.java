package com.java.beginner.GettingStarted.DiceGame;

import java.util.Scanner;

public class Maintain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the persons weight in pounds :");
        float weightInPounds=scan.nextFloat();

        System.out.println("Enter the persons height in inches :");
        float heightInInches= scan.nextFloat();

        System.out.println("Enter the persons Age in Years :");
        float ageInYears= scan.nextFloat();

//        Calculating BMR for Man
        float Man_BMR= (float) (655 + (4.3 * weightInPounds) + (4.7 * heightInInches)-(4.7 * ageInYears));
//        Calculating BMR for Women
        float Women_BMR=(float) (66 + (6.3 *weightInPounds) + (12.9 * heightInInches)-(6.8 * ageInYears));

        System.out.println("Enter the Item Name :");
        String itemName=scan.next();

        System.out.println("Enter the number of calories in "+ itemName +" :");
        float num_Calories=scan.nextFloat();

//        calculating the Man's and women's consumed Calories to maintain their weight CI-Calories intake
        float man_CI=Man_BMR/num_Calories;
        float women_CI=Women_BMR/num_Calories;

//        Printing the results
        System.out.println("A man with the given dimensions can consume "+man_CI+" number of "+ itemName+"'s to maintain his weight and a woman of the same dimensions can consume "+women_CI+" number of "+itemName+"'s to maintain her weight.");
        scan.close();
    }
}
