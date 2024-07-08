package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue operations
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Dequeue operations
        System.out.println("Dequeued: " + queue.remove()); // deletes 1

        // Peek operation
        System.out.println("Front element: " + queue.peek());

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Queue size: " + queue.size());
    }
}
