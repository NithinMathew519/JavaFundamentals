package com.java.beginner.GettingStarted.ConditionalLogicAndBlockStatements;

import java.util.Scanner;

public class calcEngine {
    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 10.0d;
        double result = 0.0d;
        char opCode = 's';
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the String : ");
        opCode= a.next().charAt(0);
        //char opCode = 's';//change the values a or s or m or d here.

        if (opCode == 'a')
            result = value1 + value2;
        else if (opCode == 's')
            result = value1 - value2;
        else if (opCode == 'm')
            result = value1 * value2;
        else if (opCode == 'd') {
            if (value2 != 0)
                result = value1 / value2;
        } else {
            System.out.println("Invalid OpCode " + opCode);
            result = 0.0d;
        }
        System.out.println(result);

        //Using Switch case
        switch (opCode){
            case 'a':
                result=value1+value2;
                break;
            case 's':
                result= value1-value2;
                break;
            case 'm':
                result=value1*value2;
                break;
            case 'd':
                result= value2 !=0 ? value1/value2 :0.0d;
                break;
            default:
                System.out.println("Invalid OPCode"+opCode);
                break;
        }
        System.out.println(result);
    }
}
