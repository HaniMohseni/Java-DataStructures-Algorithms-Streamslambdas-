package com.sg.algorithms.arrays;

import java.util.HashSet;
import java.util.Set;


public class FindingPairsOfNumbersLastVersion {

        public static void findNumbersWithSumK(int[] numbers, int k) {
            if (numbers == null || numbers.length < 2) {
                System.out.println("Array should contain at least two elements");
                return;
            }

            Set<Integer> set = new HashSet<>();

            for (int number : numbers) {
                int complement = k - number;

                if (set.contains(complement)) {
                    System.out.println("Pair found: " + number + ", " + complement);
                    return;
                }

                set.add(number);
            }

            System.out.println("No such pair found.");
        }

        public static void main(String[] args) {
            int[] numbers = {1, 5, 8, 1, 2};
            int k = 13;

            findNumbersWithSumK(numbers, k);
        }
    }
