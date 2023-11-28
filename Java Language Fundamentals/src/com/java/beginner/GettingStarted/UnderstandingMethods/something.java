package com.java.beginner.GettingStarted.UnderstandingMethods;

public class something {
    static void something1(float A,float B,int count){
        if (count<1)
            return;
        float sum=A+B;
        for (int i=0;i<count;i++)
            System.out.println(sum);
        return;
    }

    public static void main(String[] args) {
        something1(10.0F,10.0F,0);
        System.out.println("Back from show some method");
    }
}
