package com.sg.dataStructures;

import java.util.Deque;

public interface MyStack {
void printStack(Deque<String> stack);
void removeRequest(Deque<Integer> stack);
void addRequest(Deque<String> stack,String item);
}
