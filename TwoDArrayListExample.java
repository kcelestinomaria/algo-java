import java.util.ArrayList;

public class TwoDArrayListExample {
    public static void main(String[] args) {
        
        // Step 1: Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();

        // Step 2: Add rows(each row is an ArrayList)
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                row.add(i * 4 + j + 1); // Add some values, e.g., 1 to 16
            }
            twoDArrayList.add(row);
        }

        // Step 3: Print the 2D ArrayList
        for (ArrayList<Integer> row : twoDArrayList) {
            System.out.println(row);
        }
    }
}
