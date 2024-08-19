public class ArrayStack {
    private int[] array; // Array to store stack elements
    private int topOfStack; // Index of the top element
    private static final int INITIAL_CAPACITY = 10; // initial capacity of the stack

    // Constructor to initialize the stack with a default capacity
    public ArrayStack() {
        array = new int[INITIAL_CAPACITY];
        topOfStack = -1; // indicates an empty stack
    }

    // Push an element onto the stack
    public void push(int element) {
        if (topOfStack == array.length - 1) {
            resize(); // Resize the array if necessary
        }
        array[++topOfStack] = element;
    }

    // Pop the topmost element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[topOfStack--];
    }

    // Peek at the topmost element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[topOfStack];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return topOfStack == -1;
    }

    // Clear the stack
    public void clear() {
        topOfStack = -1;
    }

    // Print the Stack elements
    public void printStack() {
        System.out.print("Stack: [");
        for (int i = 0; i <= topOfStack; i++) {
            System.out.println(array[i]);
            if (i < topOfStack) {
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }

    // Resize the array when needed
    private void resize() {
        int newCapacity = array.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the stack
        stack.printStack();

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop the top element
        System.out.println("Popped element: " + stack.pop());

        // Print the stack after pop
        stack.printStack();

        // Check if the stack is empty
        System.out.println("Is stack empty?" + stack.isEmpty());

        // Clear the stack
        stack.clear();

        // Print the stack after clearing
        stack.printStack();

        System.out.println("Is stack empty?" + stack.isEmpty());
    }
}
