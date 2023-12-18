package com.sg.algorithms.arrays;

import java.util.Arrays;

public class PrintArraysAndStrings {

    public static void main(String[]args){
        printArray(new String[]{"A","B","C"});
        printString("ABCD");

    }

    public static void printArray(String[]arr){
       // System.out.println(Arrays.toString(arr));
      //  Output:     [A, B, C]

        Arrays.stream(arr).forEach(System.out::print);
        // Output: ABC

    }

    public static void printString(String s){
        for (char c: s.toCharArray()  ) {
            System.out.print(c);
        }
    }

}
