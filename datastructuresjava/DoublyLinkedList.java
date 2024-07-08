class DoublyLinkedList {
    
    private DoublyListNode<T> head;
    private DoublyListNode<T> tail;

    // Constructor to initialize an empty doubly
    // linked list
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method to add an element at the beginning of the list
    public void addFirst(T data) {
        DoublyListNode<T> newNode = new DoublyListNode<>(data);
    }
}
