package com.java.beginner.ScalerTopicsJava.Loops;

import java.util.Scanner;

public class ForMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int [][] matrix=new int[rows][columns];
        int number=1;
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                matrix[i][j]=number++;
            }

        }
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
