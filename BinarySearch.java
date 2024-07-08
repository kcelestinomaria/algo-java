public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // if target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
            int target = 12;
            int index = binarySearch(arr, target);

            if (index != -1){
                System.out.println("Element " + target + " found at index " + index);
            } else {
                System.out.println("Element " + target + " not found in the array. ");
            }
        }
    }
}
