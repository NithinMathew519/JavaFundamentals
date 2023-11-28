package com.java.beginner.GettingStarted.DiceGame;
import java.util.Scanner;

public class StudentQuestion{
    public static void main(String[] args) {
        final double Exam1_WTG = 0.1;
        final double Exam2_WTG = 0.2;
        final double Homework_WTG = 0.4;
        final double FinalExam_WTG = 0.3;

        // Variables to store input values
        int exam1, exam2;
        double homeworkAvg;

        // Create a Scanner object for user I/P
        Scanner scanner = new Scanner(System.in);

        // User input prompts
        System.out.print("Enter Exam1 Score: ");
        exam1 = scanner.nextInt();
        if (exam1 < 0 || exam1 > 100) {
            System.out.println("Please enter a valid score.");
            return;
        }

        System.out.print("Enter Exam2 Score: ");
        exam2 = scanner.nextInt();
        if (exam2 < 0 || exam2 > 100) {
            System.out.println("Please enter a valid score.");
            return;
        }

        System.out.print("Enter Homework Average score: ");
        homeworkAvg = scanner.nextDouble();
        if (homeworkAvg < 0 || homeworkAvg > 100) {
            System.out.println("Please enter a valid score.");
            return;
        }

        // Calculate the grade
        double grade = (exam1 * Exam1_WTG) + (exam2 * Exam2_WTG) + (homeworkAvg * Homework_WTG);

        // Calculate required final score for each grade
        int grade_A = (int) ((90 - grade) / FinalExam_WTG);
        int grade_B = (int) ((80 - grade) / FinalExam_WTG);
        int grade_C = (int) ((70 - grade) / FinalExam_WTG);
        int grade_D = (int) ((60 - grade) / FinalExam_WTG);
        int grade_F = (int) ((40 - grade) / FinalExam_WTG);

        // Calculate average score on the final exam
        int finalExamScore = (exam1 + exam2) / 2;

        // Calculate final grade
        int finalGrade = (int) (finalExamScore * FinalExam_WTG + grade);

        // Printing the results
        System.out.println("To get A Grade you need to score " + grade_A + " in final Exam");
        System.out.println("To get B Grade you need to score " + grade_B + " in final Exam");
        System.out.println("To get C Grade you need to score " + grade_C + " in final Exam");
        System.out.println("To get D Grade you need to score " + grade_D + " in final Exam");
        System.out.println("To get F Grade you need to score " + grade_F + " in final Exam");

        System.out.println("Assuming the average final exam score based on the previous exams performance: " + finalExamScore);
        System.out.print("The final average grade using the likely score would be: " + finalGrade + " (");

        if (finalGrade >= 90) {
            System.out.println("A)");
        } else if (finalGrade >= 80) {
            System.out.println("B)");
        } else if (finalGrade >= 70) {
            System.out.println("C)");
        } else if (finalGrade >= 60) {
            System.out.println("D)");
        } else {
            System.out.println("F)");
        }
    }
}
