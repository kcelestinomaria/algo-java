public class QueueLinkedList {
    private Node front, rear;
    private int size;

    // Constructor to initialize the queue
    public QueueLinkedList(){
        this.front = this.rear = null;
        this.size = 0;
    }

    // Add an item to the end of the queue
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Remove an item from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1; // Indicating queue is empty
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // Queue is now empty
        }
        size--;
        return item;
    }

    // Get the front item of the queue
    public int peek(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Indicating queue is empty
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue elements: ");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
