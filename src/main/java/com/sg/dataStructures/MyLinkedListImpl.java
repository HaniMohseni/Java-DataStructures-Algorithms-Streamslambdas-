package com.sg.dataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedListImpl implements MyLinkedList{
    @Override
    public void addToLinkedList(List<String>input,String item) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("banana");
        myList.add("apple");
        myList.add(0,"pear");
        input.add(item);
        System.out.println(myList);
    }

    @Override
    public List createSynchronized(List<String> input) {
        List<String>SynchronizedList = Collections.synchronizedList(input);
        return SynchronizedList;
    }

    @Override
    public void addToStartOfLinkedList(LinkedList<Integer>linkedList,int item) {
        linkedList.addFirst(item);
    }

    @Override
    public void addToEndOfLinkedList(LinkedList<Integer>linkedList,int item) {
        linkedList.addLast(item);
    }

    @Override
    public void removedEndOfLinkedList(LinkedList<Integer> linkedList) {
        linkedList.removeLast();

    }

    @Override
    public void addFirstOfLinkedList(LinkedList<Integer> linkedList) {
        linkedList.removeFirst();

    }

    @Override
    public void addToIndexOfLinkedList(LinkedList<Integer> linkedList, int item, int index) {
        linkedList.add(index,item);
    }

}
