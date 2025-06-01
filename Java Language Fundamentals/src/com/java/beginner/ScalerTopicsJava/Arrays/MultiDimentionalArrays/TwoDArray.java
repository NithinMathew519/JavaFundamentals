package com.java.beginner.ScalerTopicsJava.Arrays.MultiDimentionalArrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoD_arr=new int[4][4];
        int num=1;
        for(int i=0;i<twoD_arr.length;i++){
            for(int j=0;j<twoD_arr[i].length;j++){
                twoD_arr[i][j]=num++;
            }
        }
        for(int i=0;i<twoD_arr.length;i++){
            for(int j=0;j<twoD_arr.length;j++){
                System.out.print(twoD_arr[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}
