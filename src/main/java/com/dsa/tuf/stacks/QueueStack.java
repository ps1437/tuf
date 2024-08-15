package com.dsa.tuf.stacks;

import java.util.LinkedList;
import java.util.Queue;

//Implement Stack using Queue
class QueueStack {

    Queue<Integer> queue = new LinkedList<>();

    public QueueStack() {

    }

    public void push(int x) {
        int size = queue.size();
        queue.add(x);

        for (int i = 0; i < size; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty");
        }

        return queue.poll();

    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void print() {
        queue.forEach(System.out::println);
    }


    public static void main(String[] args) {
        QueueStack queue = new QueueStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        //    queue.print();
        System.out.println(queue.top());
        System.out.println(queue.top());
        //   queue.push(5);
        //   queue.print();


    }

}
