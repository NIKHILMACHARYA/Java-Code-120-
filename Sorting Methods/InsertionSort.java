import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            // Shift elements that are greater than current
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert current at correct position
            arr[j + 1] = current;
        }
        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

