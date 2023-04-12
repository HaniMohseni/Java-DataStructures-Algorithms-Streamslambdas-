package com.sg.algorithms.arrays;

import java.util.Arrays;

public class BinarySearchWithJ2seApi {
    public static void main(String[] args) {
        int[]ints = {1,9 , 4, 6};
        System.out.println(binarySearch( ints,  4));
        System.out.println(binarySearch( ints,  7));
    }
    public static boolean binarySearch(int[]ints, int k){
        Arrays.sort(ints);
        int result = Arrays.binarySearch(ints,k);
        if(result>0){
            return true;
        }
        else  return false;

    }
}
