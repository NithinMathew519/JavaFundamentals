package com.java.beginner.ScalerTopicsJava.Equality;

class Person{
    String name;
    Person(String name) {
        this.name = name;
    }// equals() not overridden here
}

public class Equality1 {

    public static void main(String[] args) {
        String name = "Nithin";
        String name1 = "Nithin";
        System.out.println(name == name1);      // true because name and name1 refer to the same object
        System.out.println(name.equals(name1)); // true because String overrides equals()

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);       // false, different objects (different memory locations)
        System.out.println(s1.equals(s2));  // true, same content because String overrides equals()

        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");
        System.out.println(p1 == p2);       // false, different objects
        System.out.println(p1.equals(p2));  // false, default equals compares references
    }
}
