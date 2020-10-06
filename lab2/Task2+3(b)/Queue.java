package com.company;

import java.util.ArrayDeque;



public class Queue {
    int size;
    ArrayDeque<Integer> queue = new ArrayDeque <> ();

    //No upper bound
    public Queue(){
        this.size = -1;
    }

    //Upper bound(size) == a;
    public Queue(int a){
        this.size = a; //int max value
    }

    public void push(int new_elem){
        if(check_full())
        {
            queue.add(new_elem);
        }
        else
        {
            System.out.println("Queue is full");
        }
    }

    public int pop(){
        return queue.poll();
    }

    public void check_empty(){
        if(queue.isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Queue is not empty");
        }
    }

    public boolean check_full(){
        return queue.size() != size;
    }

}
