package com.java.beginner.ScalerTopicsJava;

public class StrBuff {
    public static void main(String[] args) {
        StringBuffer m = new StringBuffer("Hello");
        String str=new String("I'm");
//        str.append()
        m.append(" World");
        m.deleteCharAt(5);
        m.setCharAt(5,' ');
        m.reverse();
        System.out.println(m);

            StringBuffer c = new StringBuffer("Hello");
            c.delete(0, 2);
            System.out.println(c);


    }
}
