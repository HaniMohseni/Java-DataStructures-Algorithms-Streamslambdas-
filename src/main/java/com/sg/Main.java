package com.sg;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyArrays myArrays = new MyArraysImpl();
        MyLinkedList myLinkedList = new MyLinkedListImpl();

        myArrays.printArray();
        String[] input = new String[]{"cat","fish"};
        myArrays.toUpperCase(input);

        LinkedList<String> inputLinkedList = new LinkedList<>();
        inputLinkedList.add("firstItem");
        inputLinkedList.add("secondItem");
        System.out.println("Synchronized list:" + myLinkedList.createSynchronized(inputLinkedList));

    }
}
