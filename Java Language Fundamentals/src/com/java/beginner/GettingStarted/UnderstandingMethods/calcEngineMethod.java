package com.java.beginner.GettingStarted.UnderstandingMethods;

public class calcEngineMethod {
    public static void main(String[] args) {
        double[] leftVals ={100.0d,200.50d,150.0d,1000.10d};
        double[] rightVals={50.0d,40.50d,150.0d,2000.90d};
        char[] opCodes={'d','s','m','a'};
        double[] results = new double[opCodes.length];

        for (int i=0;i<opCodes.length;i++){
            results[i]=execute(opCodes[i],leftVals[i],rightVals[i] );
        }
        for (double currentResults:results){
            System.out.println(currentResults);
        }
    }
    static double execute(char opCode,double leftVals,double rightVals){
        double result=0.0;
        switch (opCode){
            case 'a':
                result=leftVals+rightVals;
                break;
            case 's':
                result=leftVals-rightVals;
                break;
            case 'd':
                result=rightVals!=0 ? leftVals/rightVals:0.0d;
                break;
            case 'm':
                result=leftVals*rightVals;
                break;
            default:
                System.out.println("Invalid opCode"+opCode);
        }
        return result;
    }
}
