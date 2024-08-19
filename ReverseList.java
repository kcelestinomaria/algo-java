import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();

        // Populate the list with 5 string elements
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");
        strings.add("Elderberry");

        // Print the original list
        System.out.println("Original list: " + strings);

        // Reverse the list
        Collections.reverse(strings);

        // Print the reversed list
        System.out.println("Reversed list: " + strings);
    }
}
