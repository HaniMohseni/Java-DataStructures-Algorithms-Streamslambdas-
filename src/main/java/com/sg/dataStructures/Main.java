package com.sg.dataStructures;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Array
        MyArrays myArrays = new MyArraysImpl();
        MyLinkedList myLinkedList = new MyLinkedListImpl();
        MyStack myStack = new MyStackImpl();
        MyQueue myQueue = new MyQueueImpl();
        MyTreeSet myTreeSet = new MyTreeSetImpl();

        myArrays.printArray();
        String[] input = new String[]{"cat","fish"};
        myArrays.toUpperCase(input);

        //LinkedList
        LinkedList<String> inputLinkedList = new LinkedList<>();
        inputLinkedList.add("firstItem");
        inputLinkedList.add("secondItem");
        System.out.println("Synchronized list:" + myLinkedList.createSynchronized(inputLinkedList));

        //Stack
        Deque<String> stack=new ArrayDeque<>();
        stack.push("First Request");
        stack.push("Second Request");
        stack.push("Third Request");
        System.out.println("top item: " + stack.peek());
        System.out.println("Stack items:  " );
        myStack.printStack(stack);

        //Queue
        Queue<String> queue= new ArrayDeque<>();
        queue.offer("item one");
        queue.offer("item two");
        queue.offer("item three");
        System.out.println("first item of the queue: "+queue.peek());
        System.out.println("Queue items: ");
        myQueue.printQueue(queue);

        // priority Queue: items are sorted alphabetically or ascending numbers
        Queue<String> priorityQueue= new PriorityQueue<>();
        priorityQueue.offer("item one");
        priorityQueue.offer("item two");
        priorityQueue.offer("item three");
        priorityQueue.poll();
        System.out.println("Priority Queue items: "+priorityQueue);

        // TreeSet: unique elements in a sorted order
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        System.out.println("My TreeSet items: ");
        myTreeSet.printIntTreeSet(treeSet);

        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("pear");
        myTreeSet.printStringTreeSet(fruits);


        //output :[Pear,Mango]
        TreeSet<String> fruitsCompareLength = new TreeSet<>(Comparator.comparing(String::length));
        fruitsCompareLength.add("Mango");
        fruitsCompareLength.add("Apple");
        fruitsCompareLength.add("pear");
        System.out.println("fruitsCompareLength TreeSet: ");
        myTreeSet.printStringTreeSet(fruitsCompareLength);


    }
}
