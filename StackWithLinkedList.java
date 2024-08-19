import java.util.LinkedList;
import java.util.Stack;

class StackWithLinkedList<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Clear the stack
    public void clear() {
        list.clear();
    }

    // Check if the stack is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }

    // Return the topmost element without removing it
    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getLast();
    }

    // Push an element onto the stack
    public void push(T element) {
        list.addLast(element);
    }

    // Pop the topmost element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeLast();
    }

    // Peek the topmost element (same as top)
    public T peek() {
        return top();
    }

    // Print the stack elements
    public void printStack() {
        System.out.println("Stack: " + list);
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new StackWithLinkedList<>();

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
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Clear the stack
        stack.clear();

        // Print the stack after clearing
        stack.printStack();

    }
}