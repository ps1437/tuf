package com.dsa.tuf.stacks;


import java.util.Stack;

public class StackQueue {
    private Stack<Integer> head = new Stack();
    private Stack<Integer> tail = new Stack();

    public void push(int x) {
        head.add(x);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty");
        }

        if (tail.isEmpty()) {
            reverse();
        }

        return tail.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        // Move elements from head to tail if tail is empty
        if (tail.isEmpty()) {
            reverse();
        }
        return tail.peek();
    }

    void reverse() {
        while (!head.isEmpty()) {
            tail.push(head.pop());
        }
    }

    public boolean isEmpty() {
        return head.isEmpty() && tail.isEmpty();
    }

    public void print() {
        head.forEach(System.out::println);
    }


    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        //    queue.print();
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(queue.peek());
        //   queue.push(5);
        //   queue.print();


    }
}
