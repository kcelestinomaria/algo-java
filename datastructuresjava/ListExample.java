import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // Using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add(1, "Charlie");
        System.out.println("ArrayList: " + arrayList);

        // Accessing Elements
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Removing Elements
        arrayList.remove(1);
        System.out.println("After removal: " + arrayList);

        // Using LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add(1, "Charlie");
        System.out.println("LinkedList: " + linkedList);

        // Accessing elements
        System.out.println("Element at index 1: " + linkedList.get(1));
        
        // Removing elements
        linkedList.remove(1);
        System.out.println("After removal: " + linkedList);
    }
}