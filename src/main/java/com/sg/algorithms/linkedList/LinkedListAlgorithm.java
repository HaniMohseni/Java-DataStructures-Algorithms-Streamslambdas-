package com.sg.algorithms.linkedList;

public class LinkedListAlgorithm {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode = new Node(5);
        Node secondNode = new Node(6);
        Node thirdNode = new Node(7);
        Node forthNode = new Node(8);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        linkedList.displayContents();

    }

}
