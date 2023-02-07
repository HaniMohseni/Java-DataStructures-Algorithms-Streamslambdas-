package com.sg.dataStructures;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    MyQueue myQueue = new MyQueueImpl();

    @Test
    void addToQueue() {
        Queue<Integer>queue = new ArrayDeque<>();
        myQueue.addToQueue(queue,1);
        myQueue.addToQueue(queue,2);
        myQueue.addToQueue(queue,3);
        assertEquals(queue.peek(),Integer.valueOf(1));
    }

    @Test
    void removeFromQueue() {
        Queue<Integer>queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        myQueue.removeFromQueue(queue);
        assertEquals(queue.size(),Integer.valueOf(2));

    }
}