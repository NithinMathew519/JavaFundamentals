package com.java.beginner.ScalerTopicsJava.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqueue=new PriorityQueue<>();
        pqueue.add(100);
        pqueue.add(111);
        pqueue.add(121);
        pqueue.add(80);
        pqueue.add(91);
        System.out.print("Queue elements : "+pqueue);
        System.out.println();
        for(int i:pqueue){
            System.out.println("using For Each : "+i);
        }
//        for (int i=0;i<pqueue.size();i++){
//            System.out.println("Using for : "+pqueue.poll());
//        }
        //This will repeatedly remove the head element from the queue and print it until the queue is empty.
        while (!pqueue.isEmpty()) {
            int i = pqueue.poll();
            System.out.println("While : "+i);
        }

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
