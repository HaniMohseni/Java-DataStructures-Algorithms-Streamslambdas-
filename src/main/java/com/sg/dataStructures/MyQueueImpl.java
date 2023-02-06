package com.sg.dataStructures;

import java.util.Queue;

public class MyQueueImpl implements MyQueue{
    @Override
    public void printQueue(Queue<String> queue) {
        System.out.println(queue);

    }

    @Override
    public void addToQueue(Queue<Integer> queue, int item) {
        queue.offer(item);
    }

    @Override
    public void removeFromQueue(Queue<Integer> queue) {
        queue.poll();
    }

}
