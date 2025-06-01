package com.java.beginner.ScalerTopicsJava.Collections;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackVsQueue <E>{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.add(20);
        stack.add(30);
        stack.add(10);
        stack.add(15);
        stack.add(5);
        stack.push(8);
        System.out.println("Stack Elements : "+stack);
        while(!stack.isEmpty()){
            System.out.println("Popped"+stack.pop());
        }
        System.out.println();
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(100);
        queue.add(111);
        queue.add(121);
        queue.add(80);
        queue.add(91);
        queue.add(20);
        queue.add(70);
        System.out.println("Queue elements : "+queue);
        while (!queue.isEmpty()) {
            int i = queue.poll();
            System.out.println("While : "+i);
        }
    }

}
