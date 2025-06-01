package com.java.beginner.ScalerTopicsJava.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Enter your String: ");
        String name = bufferedReader.readLine();
        System.out.print("You entered: ");
        System.out.println(name);
        bufferedReader.close();
        inputStreamReader.close();
    }

//    public static void main(String[] args) throws IOException {
//        InputStreamReader input = new InputStreamReader(System.in);
//        BufferedReader reader = new BufferedReader(input);
//
//        System.out.print("Please enter the input: ");
//        String name = reader.readLine(); // input string
//        System.out.print("You entered: ");
//        System.out.println(name);
//
//        // Closing to avoid memory leak.
//        input.close();
//    }
}