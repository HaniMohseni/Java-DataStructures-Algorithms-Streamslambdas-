package com.sg.algorithms.hashMap.hasCycleInLinkedList;


public class HasCycle {
    public static void main(String[] args) {
        CustomLinkedList noCycleLinkedList = new CustomLinkedList();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node forthNode = new Node(6);

        noCycleLinkedList.head=firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        System.out.println(noCycleLinkedList.hasCycle());

        CustomLinkedList cycleLinkedList = new CustomLinkedList();
        cycleLinkedList.head=firstNode;
        thirdNode.next=secondNode;
        System.out.println(cycleLinkedList.hasCycle());




    }
}
