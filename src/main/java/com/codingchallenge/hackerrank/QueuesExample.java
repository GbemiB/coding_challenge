package com.codingchallenge.hackerrank;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesExample {
    LinkedList queue;

    //Making a queue instance
    public void Queue(){
        queue = new LinkedList();
    }

    //Check if queue is empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    //checking queue size
    public int size(){
        return queue.size();
    }

    //end queue
    public void endQueue(int n){
        queue.addLast(n);
    }

    //dequeuing
    public int deQueue(){
       return (int) queue.remove(0);
    }

    //peek at the first item, it won't delete it
    public int peek(){
      return (int) queue.get(0);
    }

    public static void main(String[] args){
        QueuesExample numberQueues = new QueuesExample();
        numberQueues.endQueue(5);
        numberQueues.endQueue(6);
        numberQueues.endQueue(7);
        System.out.println("First out" + numberQueues.deQueue());
        System.out.println("Second out" + numberQueues.deQueue());
        System.out.println("Third out" + numberQueues.deQueue());
     }
}
