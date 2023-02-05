package com.sg;

import java.util.Arrays;

public class MyArraysImpl implements MyArrays {

    @Override
    public void incrementArray(int[] input) {
        for (int i=0;i<input.length;i++){
            input[i]++;
        }

    }

    @Override
    public void printArray() {
        String[] days = new String[7];
        System.out.println(Arrays.toString(days));
        String[] days2 = new String[]{"Monday","Tuesday","Wednesday"};
        for (String day : days2) {
            System.out.println("day:" + day);

        }

    }

    @Override
    public void toUpperCase(String[] input) {

        for (int i=0;i<input.length;i++){
           input[i]= input[i].toUpperCase();
        }
        System.out.println(Arrays.toString(input));

    }


}
