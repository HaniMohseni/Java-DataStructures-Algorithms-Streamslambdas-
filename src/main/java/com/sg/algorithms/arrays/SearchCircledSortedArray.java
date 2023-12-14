package com.sg.algorithms.arrays;


import java.util.HashSet;
        import java.util.Set;

public class SearchCircledSortedArray {


    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = search(arr, target);
        System.out.println(index);


    }

    public static int search(int[] arr, int target) {

        int left = 0;
        int right = arr.length -1;
        int mid = 0;
        while (left<=right){
            mid= left + (left+right)/2;
            if (arr[mid]==target){
                return mid;
            }
            if(arr[left]<=arr[right]){
                if(target>=arr[left] && target<arr[mid]){
                    right = mid-1;
                }else {
                    left=mid+1;
                }

            }else{
                if(target>=arr[mid] && target<arr[right]){
                    left=mid+1;
                } else{
                    right = mid-1;
                }


            }

        }


        return -1;

    }

}

//output : 4