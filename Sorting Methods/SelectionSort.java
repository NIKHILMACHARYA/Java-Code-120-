import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // Find index of the smallest element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

