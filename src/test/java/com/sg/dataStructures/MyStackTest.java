package com.sg.dataStructures;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    MyStack myStack = new MyStackImpl();

    @Test
    void removeRequest() {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        myStack.removeRequest(stack);
        assertEquals(Integer.valueOf(4),stack.peek());

    }

    @Test
    void addRequest() {
        Deque<String> stack = new ArrayDeque<>();
        myStack.addRequest(stack,"A");
        myStack.addRequest(stack,"B");
        myStack.addRequest(stack,"C");
        assertEquals(stack.peek(),String.valueOf("C"));
    }
}