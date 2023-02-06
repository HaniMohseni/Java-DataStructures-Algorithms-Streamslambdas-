package com.sg.dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    MyArrays myArrays = new MyArraysImpl();

    @Test
    void incrementArray() {

        int[] input = new int[]{1,2,3};
        myArrays.incrementArray(input);
        assertArrayEquals(new int[]{2,3,4},input);

    }

    @Test
    void toUpperCase(){
        String[] input = new String[]{"cat","fish"};
        myArrays.toUpperCase(input);
        assertArrayEquals(new String[]{"CAT","FISH"},input);

    }
}