// Now, we define the LinkedList class
// to implement operations on the linked list
class LinkedList<T> {

  private Node<T> head; // Reference to the head node of the list


  // Constructor to initialize an empty linked list
  public LinkedList() {
    this.head = null;
  }


  // Method to add element at the beginning of the list
  public void addFirst(T data){
    Node<T> newNode = new Node<>(data);

    // Set the next of the new node to the current head
    newNode.next = head;

    // Set the new node as the new head of the list
    head = newNode;
  }


  // Method to add an element at the end of the list
  public void addLast(T data){

    // Create a new node with the given data
    Node<T> newNode = new Node<>(data);

    if(head == null){
      head = newNode; // if list is empty, set the new node as the head
      return;
    }
    Node<T> current = head;
    while(current.next != null){
      current = current.next; // Traverse to the end of the list
    }
    current.next = newNode; // Set the next of the last node to the new node
  }

  // Method to add an element at a specific position in the list
  public void add(int index, T data){
    if (index < 0){
      throw new IndexOutOfBoundsException("Index cannot be negative: " + index);
    }
    Node<T> newNode = new Node<>(data);
    if (index == 0){
      newNode.next = head; // Insert at the beginning if index is 0
      head = newNode; // Set the new node as the new head
      return;
    }
    Node<T> current = head;
    int currentIndex = 0;
    while (current != null && currentIndex < index - 1){
      current = current.next; // Traverse to the node before the insertion point
      currentIndex++;
    }
    if (current == null){
      throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }
    newNode.next = current.next; // Insert the new node between current and current.next
    current.next = newNode;
  }

  // Method to remove the first occurrence of a specific
  // element in the list
  public boolean remove(T data){
    if (head == null){
      return false; // Return false if the list is empty
    }
    if (head.data.equals(data)) {
      head = head.next; // Remove the head if it matches the data
      return true;
    }
    Node<T> current = head;
    while(current.next != null && !current.next.data.equals(data)) {
      current = current.next; // Traverse to find the node before the node to be removed
    }
    if (current.next == null){
      return false; // Return false if the element was not found in the list
    }
    current.next = current.next.next; // Remove the node by skipping it in the list
    return true;
  }

  // Method to get the element at a specific index in the list
  public T get(int index){
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index cannot be negative: " + index);
    }
    Node<T> current = head;
    int currentIndex = 0;
    while (current != null && currentIndex < index){
      current = current.next; // Traverse to find the node at the specified index
      currentIndex++;
    }
    if (current == null){
      throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }
    return current.data; // Return the data of the node at the specified index
  }

  
}