package com.sg.algorithms.arrays;

//given a nested array, (can be infinitely nested), like: [1,2,[3,4],[5,[6,7]]]  return sum 28

import java.util.ArrayList;
        import java.util.List;

public class NestedArrayItemSum {

    // Method to calculate sum of elements in a nested array
    public static int calculateSum(List<Object> nestedArray) {
        int sum = 0;
        // Loop through each element in the nestedArray
        for (Object obj : nestedArray) {
            // Check if the element is an Integer
            if (obj instanceof Integer) {
                // If it's an Integer, add it to the sum
                sum += (int) obj;
            } else if (obj instanceof List) {
                // If it's a List, recursively call calculateSum to get the sum of its elements
                sum += calculateSum((List<Object>) obj);
            }
        }
        return sum;
    }

    // Main method where the code execution begins
    public static void main(String[] args) {
        // Create a List representing the nested array [1,2,[3,4],[5,[6,7]]]
        List<Object> nestedArray = new ArrayList<>();
        nestedArray.add(1);
        nestedArray.add(2);

        // Create innerArray1 and add elements [3,4] to it
        List<Object> innerArray1 = new ArrayList<>();
        innerArray1.add(3);
        innerArray1.add(4);
        nestedArray.add(innerArray1);

        // Create innerArray2 and add element 5 to it
        List<Object> innerArray2 = new ArrayList<>();
        innerArray2.add(5);

        // Create innerArray3 and add elements [6,7] to it
        List<Object> innerArray3 = new ArrayList<>();
        innerArray3.add(6);
        innerArray3.add(7);
        innerArray2.add(innerArray3);

        // Add innerArray2 (containing [5,[6,7]]) to the nestedArray
        nestedArray.add(innerArray2);

        // Calculate the sum of the elements in the nestedArray
        int result = calculateSum(nestedArray);

        // Print the sum of the nested array
        System.out.println("Sum of the nested array: " + result);
    }
}
