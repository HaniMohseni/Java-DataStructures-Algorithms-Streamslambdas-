package com.sg.algorithms.arrays;

import java.util.Arrays;



public class SearchItemIndexInSortedArray {


    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 6, 7, 9};
        int target = 5;
        int index = search(arr, target);
        if (index == -1){
            System.out.println("not found");
        }
        else {
            System.out.println(index);
        }


    }

    public static int search (int[]arr, int target){
        int index = Arrays.binarySearch(arr,target);
        return index;


    }
}
