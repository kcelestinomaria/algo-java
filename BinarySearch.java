public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Target found at index mid
            }
            if (arr[mid] < target) {
                low = mid + 1; // Search in the upper half
            } else {
                high = mid - 1; // Search in the lower half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 15;

        int result = binarySearch(sortedArray, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}