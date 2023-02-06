package com.sg.dataStructures;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    MyLinkedList myLinkedList = new MyLinkedListImpl();

    @Test
    void addToLinkedList() {
        LinkedList<String> testLinkedList = new LinkedList<>();
        testLinkedList.add("A");
        testLinkedList.add("B");
        myLinkedList.addToLinkedList(testLinkedList,"C");
        assertEquals(testLinkedList.size(),3);



    }
}