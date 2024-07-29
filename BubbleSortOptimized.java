/*
 * Optimized Version of Bubble Sort
 * This one includes a flag to check if any swaps were made
 * during the pass
 * If no swaps were made, the algorithm can terminate early,
 * improving its best-case perfomance
 */

 public class BubbleSortOptimized {

    public static void bubbleSort(int[] arr) {

      int n = arr.length;
      boolean swapped;

      for(int i = 0; i < n - 1; i++) {
         swapped = false;
         
         for(int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
               // Swap arr[j] and arr[j + 1]
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
               swapped = true;
            }
         }

         // If no two elements were swapped by inner loop, then
         // the array is sorted
         if (!swapped) break;
      }
    }

    public static void main(String[] args) {
      int[] arr = {64, 34, 25, 12, 22, 11, 90};
      bubbleSort(arr);
      System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));
    }
 }