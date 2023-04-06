package com.sg.algorithms.arrays;

import java.util.Arrays;

public class RotateArray {
    public static int[]rotateLeft(int[]arr){
        int temp = arr[0];
        for (int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
//        or in this way
//        for(int i=1; i< arr.length; i++) {
//            arr[i-1] = arr[i];
//        }

          arr[arr.length-1]=temp;
        return arr;
    }

    public static int[] rightRotate(int[]arr){
        int endOfArr= arr[arr.length-1];
        for(int i=arr.length-1; i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=endOfArr;

        return arr;
    }


    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
       Arrays.stream(rotateLeft(arr)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(rightRotate(arr)).forEach(System.out::print);


    }

}
