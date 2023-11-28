package com.java.beginner.GettingStarted;

public class Variables {
    public static void main(String[] args) {
        int myVar;
        myVar=50;
        System.out.println(myVar);
        int anotherVar=100;
        System.out.println(anotherVar);

        final int maxStudents=25;
        final int someVariables;
        int someOtherVariables=100;
        someVariables=someOtherVariables;
        System.out.println(someVariables);
        System.out.println(maxStudents);

        float kilometersInAMarathon=42.195f;
        float absoluteZeroInCelSius =-273.15f;
        System.out.println(kilometersInAMarathon);
        System.out.println(absoluteZeroInCelSius);

        double atomWidthInMeter=0.0000000001d;
        System.out.println(atomWidthInMeter);

        char regularU='U';
        System.out.println(regularU);
        char accentedU='\u00DA';
        System.out.println(accentedU);
    }
}
