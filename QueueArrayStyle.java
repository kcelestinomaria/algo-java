public class QueueArrayStyle {
    private int[] array;
    private int front, rear, size, capacity;

    // Constructor to initialize the queue
    public Queue(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Add an item to the end of the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queuue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        array[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Remove an item from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1; // Indicating queue is empty
        }
        int item = array[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return item;
    }

    // Get the front item of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Indicating queue is empty
        }
        return array[front];
    }

    // Chec if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Print the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    
}
