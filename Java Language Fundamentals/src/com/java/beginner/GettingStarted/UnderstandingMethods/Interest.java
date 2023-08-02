package com.java.beginner.GettingStarted.UnderstandingMethods;

public class Interest {
    static double CalculateInterest(double amt,double rate,int years){
//        double interest =amt*rate*years;
        return amt*rate*years;
    }

    public static void main(String[] args) {
        double result=CalculateInterest(1000.0d,2.0,2);
        System.out.println(result);
    }

}
