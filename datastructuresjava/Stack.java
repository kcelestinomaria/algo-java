import java.util.EmptyStackException

// Stack implementation using an Array
class Stack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elements;
    private int size;

    // Constructor to initialize an empty stack
    public Stack() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Method to add an element to the top of the stack
    public void push(T item) {
        if (size == elements.length) {
            expandCapacity(); // Double the array size if full
        }
        elements[size++] = item; // Add item to the top and increment size
    }

    // Method to remove and return the element at the top of the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Throw exception if stack is empty
        }
        T item = elements[--size]; // Get item at the top and decrement size
        elements[size] = null; // Remove reference to help with garbage collection
        return item; // Return removed item
    }

    private void expandCapacity(){
        T[] newElements = (T[])
    }
}

