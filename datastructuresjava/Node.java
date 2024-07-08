// Let's define a Node class to represent nodes
// in the linked list
class Node<T> {
    T data; // Data stored in the node
    Node<T> next; // Reference to the next node in the list

    // A Constructor to initialize the node with data
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}