package com.sg.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class FilterEvenNumbers {

    public static int[] findEvenNums(int[]arr1, int[]arr2){

        ArrayList<Integer> result = new ArrayList();
        for(int num :arr1){
            if((num%2)==0){
                result.add(num);
            }
        }
        for(int num:arr2){
            if((num%2)==0){
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }

    //second way java lambdas
    public static int[] findEvenNums2(int[]arr1,int[]arr2){
        IntPredicate isEvenNum = num -> num % 2 == 0;
        return Stream
                .of(arr1,arr2)
                .flatMapToInt(Arrays::stream)
                .filter(isEvenNum)
                .toArray();

    }

    public static void main(String[] args) {
        int[] arr1 = {-9, 3, 2, -16,5,8};
        int[]arr2 = {0, 2, 4,-10, 33,34};
        Arrays.stream(findEvenNums(arr1,arr2)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(findEvenNums2(arr1,arr2)).forEach(System.out::println);


    }
}
