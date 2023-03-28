package com.sg.algorithms.arrays;

import java.util.Arrays;

public class ReverseArray {

    //first way by using new array for result
    public static int[] reverse (int[]arr){
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i]=arr[arr.length-1-i];
        }
        return result;
    }
    //Second way by using the same array
    public static int[] reverse2(int[]arr){
        for (int i=0; i<arr.length /2; i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Arrays.stream(reverse(arr)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(reverse2(arr)).forEach(System.out::println);

    }
}
