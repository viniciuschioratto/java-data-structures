package org.example;

public class ArrayType {

    /**
     * This method prints the elements of an integer array.
     * It is using primitive data type int[].
     * @param arr the integer array to be printed
     */
    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    /**
     * This method sorts an integer array using the bubble sort algorithm.
     * This algorithm has a time complexity of O(n^2).
     * It needs to iterate through the array multiple times to sort it.
     * It is inefficient for large datasets.
     *
     * @param arr the integer array to be sorted
     */
    public void bubbleSort(int[] arr) {
        System.out.println("Sorting the array using bubble sort:");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        printArray(arr);
    }

    /**
     * This method sorts an integer array using the selection sort algorithm.
     * This algorithm has a time complexity of O(n^2).
     * It is inefficient for large datasets.
     *
     * @param arr the integer array to be sorted
     */
    public void insertionSort(int[] arr) {
        System.out.println("Sorting the array using insertion sort:");
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        // Print the sorted array
        printArray(arr);
    }

    /**
     * This method sorts an integer array using the quick sort algorithm.
     * This algorithm has a time complexity of O(n log n) on average.
     * It is efficient for large datasets.
     *
     * @param arr the integer array to be sorted
     * @param low the starting index of the array
     * @param high the ending index of the array
     */
    public void quickSort(int[] arr, int low, int high) {
        System.out.println("Sorting the array using quick sort:");
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        // Print the sorted array
        printArray(arr);
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /**
     * This method sorts an integer array using the merge sort algorithm.
     * This algorithm has a time complexity of O(n log n).
     * It is efficient for large datasets.
     *
     * @param arr the integer array to be sorted
     * @param left the starting index of the array
     * @param right the ending index of the array
     */
    public void mergeSort(int[] arr, int left, int right) {
        System.out.println("Sorting the array using merge sort:");
        if (left < right) {
            // Find the middle point
            int middle = (left + right) / 2;

            // Sort first and second halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
        // Print the sorted array
        printArray(arr);
    }

    private void merge(int[] arr, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, middle + 1, R, 0, n2);

        // Merge the temporary arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
