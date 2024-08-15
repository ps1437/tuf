//package com.dsa.tuf.stacks;
//
//
//
//public class NodeQueue {
//    Node head;
//    Node tail;
//    int capacity = 0;
//
//    public void push(int value) {
//        Node newNode = new Node(value);
//        if (tail == null) { // Queue is empty
//            head = tail = newNode;
//        } else {
//            tail.next = (newNode);
//            tail = newNode;
//        }
//
//        capacity++;
//    }
//
//
//    public void print() {
//        Node temp = head;
//
//        while (temp != null) {
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//    }
//
//    public int pop() {
//        if (isEmpty()) {
//            throw new IllegalStateException("Queue is empty");
//        }
//        int value = peek();
//        head = head.next;
//        if (head == null) {
//            tail = null;
//        }
//
//        capacity--;
//        return value;
//    }
//
//    public int peek() {
//
//        if (isEmpty()) {
//            throw new IllegalStateException("Queue is empty");
//        }
//        return head.data;
//    }
//
//    public int size() {
//        return capacity;
//    }
//
//    public boolean isEmpty() {
//        return capacity == 0;
//    }
//
//    public static void main(String[] args) {
//        NodeQueue queue = new NodeQueue();
//        System.out.println("peek " + queue.peek());
//        queue.push(1);
//        queue.push(2);
//        queue.push(3);
//        queue.push(4);
//        queue.print();
//        System.out.println("peek " + queue.peek());
//
//
//    }
//}
