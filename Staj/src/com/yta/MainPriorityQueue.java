package com.yta;

import java.util.PriorityQueue;
import java.util.Queue;


public class MainPriorityQueue {
    
    public static void main(String[] args) {
        
        Queue<Integer> priorityQueue = new PriorityQueue<Integer>();
        
        priorityQueue.add(10);
        priorityQueue.offer(3);
        priorityQueue.add(7);
        priorityQueue.add(30);
        
        System.out.println(priorityQueue.peek());
        System.out.println("Çıkarılan eleman: " + priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        
        System.out.println();
     //   for (Integer x : priorityQueue) {
       //     System.out.println(x);}
       
        System.out.println(priorityQueue.contains(10));
        
        System.out.println(priorityQueue.size());
        priorityQueue.clear();
        System.out.println(priorityQueue.size());
                
    }
}
