package com.java.beginner.ScalerTopicsJava.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CakeShop implements Iterable<String> {
    private List<String> cakes = new ArrayList<>();

    // Add a cake to the shop
    public void addCake(String cake) {
        cakes.add(cake);
    }

    // Implement the iterator() method from Iterable interface
    @Override
    public Iterator<String> iterator() {
        return cakes.iterator();
    }

    public static void main(String[] args) {
        CakeShop shop = new CakeShop();

        // Add some cakes
        shop.addCake((String) "Chocolate");
        shop.addCake((String) "Vanilla");
        shop.addCake((String) "Strawberry");

        // 1. Enhanced for loop (for-each loop)
        System.out.println("Enhanced for loop:");
        for (String cake : shop) {
            System.out.println(cake);
        }

        // 2. Iterable forEach loop (using lambda expression)
        System.out.println("\nIterable forEach loop:");
        shop.forEach(cake -> System.out.println(cake));

        // 3. Iterator<T> interface
        System.out.println("\nIterator interface:");
        Iterator<String> iterator = shop.iterator();
        while (iterator.hasNext()) {
            String cake = iterator.next();
            System.out.println(cake);
        }
    }
}
