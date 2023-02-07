package com.sg.dataStructures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Test
    void addToStartOfLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(2,3,4,5));
        myLinkedList.addToStartOfLinkedList(linkedList,1);
        assertEquals(Integer.valueOf(1),linkedList.getFirst());
    }

    @Test
    void addToEndOfLinkedList() {
        LinkedList<Integer>linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        myLinkedList.addToEndOfLinkedList(linkedList,6);
        assertEquals(Integer.valueOf(6),linkedList.getLast());
    }

    @Test
    void removedEndOfLinkedList() {
        LinkedList<Integer>linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        myLinkedList.removedEndOfLinkedList(linkedList);
        assertEquals(linkedList.size(),4);
    }

    @Test
    void addToIndexOfLinkedList() {
        LinkedList<Integer>linkedList = new LinkedList<>(Arrays.asList(1,2,4,5));
        myLinkedList.addToIndexOfLinkedList(linkedList,3,2);
        assertEquals(linkedList.get(2),3);
    }
}