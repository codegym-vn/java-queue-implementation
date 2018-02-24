package com.codegym.util;

public class TestPriorityQueue {
    public static void main(String[] args) {
        MyPriorityQueue<Integer> queue = new MyPriorityQueue<>();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(4);
        queue.enqueue(6);

        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
