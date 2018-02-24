package com.codegym.util;

public class TestQueue {
    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();

        queue.enqueue("America");
        queue.enqueue("Canada");
        queue.enqueue("France");

        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}