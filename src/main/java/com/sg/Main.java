package com.sg;

public class Main {
    public static void main(String[] args) {

        MyArrays myArrays = new MyArraysImpl();
        myArrays.printArray();
        String[] input = new String[]{"cat","fish"};
        myArrays.toUpperCase(input);

    }
}
