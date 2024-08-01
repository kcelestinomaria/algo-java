import java.util.ArrayList;

public class TwoDArrayList {
    
    private ArrayList<ArrayList<Integer>> TwoDArray;

    public TwoDArrayList() {
        TwoDArray = new ArrayList<>();
    }

    // Add a new row to the 2D ArrayList
    public void addRow(ArrayList<Integer> row) {
        TwoDArray.add(row);
    }

    // Add an element to a specific position in the 2D ArrayList
    public void addElement(int row, int col, int value) {
        // Ensure the row exists
        while( TwoDArray.size() <= row ) {
            TwoDArray.add(new ArrayList<>());
        }

        // Ensure the column exists
        while(TwoDArray.get(row).size() <= col) {
            TwoDArray.get(row).add(0);
        }
        TwoDArray.get(row).set(col, value);
    }

    
}
