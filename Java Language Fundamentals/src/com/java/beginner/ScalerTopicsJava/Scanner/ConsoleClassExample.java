package com.java.beginner.ScalerTopicsJava.Scanner;

import java.io.Console;

public class ConsoleClassExample {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter your name: ");
        String n = c.readLine(); // string input
        System.out.println("Welcome " + n);
    }
}

//This method fails to work in interactive environments like IDEs where all the input is not given at once.
//The method does not allow us tojava CommandLineArguments Hello Java utilize shortcuts offered by popular compilers like Visual Studio Code and IntelliJ.