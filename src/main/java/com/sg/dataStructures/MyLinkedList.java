package com.sg.dataStructures;

import java.util.LinkedList;
import java.util.List;

public interface MyLinkedList {
    void addToLinkedList(List<String>input,String item);
    List createSynchronized(List<String>input);
    void addToStartOfLinkedList(LinkedList<Integer> linkedList, int item);
    void addToEndOfLinkedList(LinkedList<Integer> linkedList, int item);
    void removedEndOfLinkedList(LinkedList<Integer> linkedList);
    void addToIndexOfLinkedList(LinkedList<Integer> linkedList, int item, int index);

}
