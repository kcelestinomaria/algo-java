class DoublyListNode<T> {
    T data;
    DoublyListNode<T> prev; // Reference to the previous node
    DoublyListNode<T> next; // Reference to the next node

    // Constructore to initialize the node with data
    public DoublyListNode(T data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
