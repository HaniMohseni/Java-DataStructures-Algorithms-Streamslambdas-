package com.sg.algorithms.arrays;

public class MaxDifference {


    public static int MaxDifference(int[]arr){

        int minDay = arr[0];
        int maxDiff = 0;
        for (int i=1; i<arr.length -1; i++){
            if (arr[i]< minDay){
                minDay= arr[i];
            }
            else {
                int diff = arr[i]- minDay;
                if(diff>maxDiff){
                    maxDiff=diff;
                }
            }
        }
        return  maxDiff;

    }

    public static void main(String[] args) {
        int[] daysOfWeek = {10, 15, 9, 15, 6};
       int maxDifference=  MaxDifference(daysOfWeek);
        System.out.println("The maximum difference in days is: " + maxDifference);
    }
}

