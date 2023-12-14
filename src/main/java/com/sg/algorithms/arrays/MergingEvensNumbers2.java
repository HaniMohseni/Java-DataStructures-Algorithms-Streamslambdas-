package com.sg.algorithms.arrays;

import java.util.ArrayList;


public class MergingEvensNumbers2 {

    public static void main(String[] args) {

        (merge(new int[]{1,2,3}, new int[]{2, 4, 6, 8})).stream().forEach(System.out::print);

    }

    public static ArrayList<Integer> merge(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList();
        for (int i : arr1) {
            if (i % 2 == 0) {
                result.add(i);

            }

        }
        for (int i : arr2) {
            if (i % 2 == 0) {
                result.add(i);

            }

        }
        return result;

    }
}
