package com.sg.dataStructures;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStackImpl implements MyStack{

    @Override
    public void printStack(Deque<String> stack) {

        System.out.println(stack);

    }
    @Override
    public void removeRequest(Deque<Integer> stack) {
        stack.pop();
    }

    @Override
    public void addRequest(Deque<String> stack, String item) {
        stack.push(item);
    }
}
