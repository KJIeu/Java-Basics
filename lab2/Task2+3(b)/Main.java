package com.company;

public class Main {

    public static void main(String[] args) {

        Queue queue_a = new Queue();
        queue_a.push(1);
        queue_a.push(1337);
        queue_a.push(322);
        System.out.println("Queue_a");
        queue_a.check_empty();
        System.out.println("-----------------\n");
        System.out.println("Queue_b");
        Queue queue_b = new Queue(3);
        queue_b.push(1);
        queue_b.push(1337);
        queue_b.push(322);
        if (queue_b.check_full())
        {
            System.out.println("Queue is not full");
        }
        else
        {
            System.out.println("Queue is full");
        }
        System.out.println(queue_b.pop());
        //same, but using methods from ArrayDeque Class
        System.out.println(queue_b.queue.poll());
        queue_b.queue.remove();
        //-------
        queue_b.check_empty();
    }
}
