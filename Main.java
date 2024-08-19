import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();

        // Populate the list with the first ten positive integers
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Find the maximum and minimum values in the list
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        // Print the list, maximum and minimum values
        System.out.println("List of integers: " + numbers);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}