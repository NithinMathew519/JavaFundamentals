package com.java.beginner.ScalerTopicsJava.WrapperClasses;
// This is an Example of a custom wrapper class
public class CustomWrapperClasses {
    private int x;
    private int y;
    public CustomWrapperClasses(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "CustomWrapperClasses{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
