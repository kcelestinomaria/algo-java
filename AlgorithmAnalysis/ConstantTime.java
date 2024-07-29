package AlgorithmAnalysis;
public class ConstantTime {
    public static int getElement(int[] arr, int index) {
        return arr[index]; // O(1)
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getElement(arr, 2)); // Output: 3
    }
}
