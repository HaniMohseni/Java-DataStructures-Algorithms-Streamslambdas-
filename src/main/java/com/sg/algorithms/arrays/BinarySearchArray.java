package com.sg.algorithms.arrays;

import java.util.Arrays;

public class BinarySearchArray {
    public static boolean binarySearch(int[]arr,int item ){
        int min=0;
        int max=arr.length-1;
        int mid=0;
        while (min<=max){
            mid = (min+max) /2;
            if(item==arr[mid]){
                return true;
            }
            else if(item<arr[mid]){
                max=mid-1;
            }
            else min= mid+1;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(binarySearch(arr,5));
        System.out.println(binarySearch(arr,7));

        //Second way
        System.out.println(Arrays.binarySearch(arr,4));

    }
}
