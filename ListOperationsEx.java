import java.util.ArrayList;
import java.util.List;

public class ListOperationsEx {
    public static void main(String[] args) {

        // 1. Create Empty List
        List<Integer> list = new ArrayList<>();

        // 2. Add elements to the list
        list.add(34);
        list.add(12);
        list.add(52);

        // Print List
        System.out.println("List: " + list);

        // 3. Find (Locating the Position of an Object)
        int findValue = 52;
        int index = list.indexOf(findValue);
        System.out.println("Index of " + findValue + ": " + index);

        // 4. Insert (Insert an Object at a Specific Position)
        list.add(3, 100); // Inserting 100 at index 3
        System.out.println("List after insertion: " + list);

        // 5. Remove (Delete an Element from the List)
        list.remove(Integer.valueOf(52));
        System.out.println("List after removal: " + list);
    }
}
