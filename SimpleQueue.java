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
        System.out.println("Front element: " + queue.peek())
    }
}