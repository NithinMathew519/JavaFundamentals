package com.java.beginner.ScalerTopicsJava.Scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        float b=scanner.nextFloat();
        System.out.println(a);
        System.out.println(b);
        scanner.close();
    }
}
