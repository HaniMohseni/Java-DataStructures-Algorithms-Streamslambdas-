package com.sg.algorithms;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {12, 9, 4, 99, 120, 1, 3, 10};

        System.out.println("Original Array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    // Method to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find partition index
            int partitionIndex = partition(arr, low, high);
            // Recursively sort elements before and after partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] arr, int low, int high) {
        // Select the pivot element (here, the last element)
        int pivot = arr[high];
        int i = (low - 1);

        // Rearrange elements smaller than pivot to the left, larger to the right
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // Place the pivot element in its correct position
        // by swapping arr[i+1] and arr[high] (or the pivot)
        swap(arr, i + 1, high);
        return i + 1; // Return the partition index
    }

    // Method to swap elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

