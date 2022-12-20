package com.java.beginner.GettingStarted.LoopingAndArrays;

public class calcEngineUsingArrays {
    public static void main(String[] args) {
        double[] leftValues = {10.0d, 20.0d, 30.0d, 40.0d};
        double[] rightValues = {10.0d, 20.0d, 30.0d, 40.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] result = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    result[i] = leftValues[i] + rightValues[i];
                    break;
                case 's':
                    result[i] = leftValues[i] - rightValues[i];
                    break;
                case 'm':
                    result[i] = leftValues[i] * rightValues[i];
                    break;
                case 'd':
                    result[i]=leftValues[i]/rightValues[i];
                    break;
                default:
                    System.out.println("Invalid OpCode : "+opCodes[i]);
                    result[i]=0.0d;
                    break;
            }
        }
        for (double currentResult:result)
            System.out.println(currentResult);
    }
}
