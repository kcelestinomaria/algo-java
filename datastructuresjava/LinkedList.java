public class LinkedList {
    private Node head;
    private int size;

    public static class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
        }
    }
    
    
    //Let's add an element to the beginning
    // of the list
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Let's add an element at a 
    // specific index
    public void addAtIndex(int index, int data){
        if (index < 0 || index > size){
            throw new IllegalArgumentException("Index out of bounds");
        }

        if (index == 0){
            addFirst(data);
            return;
        }

        Node current = head;
        int counter = 0;

        while (current != null && counter < index - 1){
            current = current.next;
            counter++;
        }

        if (current == null){
            throw new IllegalArgumentException("Index out of bounds");
        }

        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }


    // Get the element at a specific index
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Index out of bounds");
        }

        Node current = head;
        int counter = 0;

    while (current != null && counter < index) {
      current = current.next;
      counter++;
    }

    if (current == null) {
      throw new IllegalArgumentException("Index out of bounds");
    }

    return current.data;
  }

  // Remove the element at a specific index
  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IllegalArgumentException("Index out of bounds");
    }

    if (index == 0) {
      head = head.next;
      size--;
      return;
    }

    Node current = head;
    int counter = 0;

    while (current != null && counter < index - 1) {
      current = current.next;
      counter++;
    }

    if (current == null || current.next == null) {
      throw new IllegalArgumentException("Index out of bounds");
    }

    current.next = current.next.next;
    size--;
  }

  // Check the size of the list
  public int size() {
    return size;
  }

  // Check if the list is empty
  public boolean isEmpty() {
    return size == 0;
  }
}
    
