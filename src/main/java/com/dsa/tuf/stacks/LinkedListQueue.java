package com.dsa.tuf.stacks;

import java.util.LinkedList;

//Implement queue using Linkedlist
public class LinkedListQueue {
    LinkedList<Integer> list;

    public LinkedListQueue() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    public void print() {
        list.forEach(System.out::println);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        // Test isEmpty on an empty queue
        System.out.println("Is the queue empty? " + queue.isEmpty()); // Expected: true

        // Enqueue elements
        queue.push(10);
        queue.push(20);
        queue.push(30);

        // Test peek
        System.out.println("Front element: " + queue.peek()); // Expected: 10

        // Dequeue elements
        System.out.println("Removed element: " + queue.pop()); // Expected: 10
        System.out.println("Removed element: " + queue.pop()); // Expected: 20

        // Test peek after some dequeue operations
        System.out.println("Front element after dequeue: " + queue.peek()); // Expected: 30

        // Test isEmpty after dequeuing all elements
        queue.pop(); // Remove last element
        System.out.println("Is the queue empty after dequeueing all elements? " + queue.isEmpty()); // Expected: true


    }
}
