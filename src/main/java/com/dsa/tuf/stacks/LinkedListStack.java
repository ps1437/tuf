//package com.dsa.tuf.stacks;
//
//public class LinkedListStack {
//
//    Node head;
//
//    public LinkedListStack() {
//
//    }
//
//    public void push(int x) {
//        Node newNode = new Node(x);
//        newNode.next = head;
//        head= newNode;
//    }
//
//    public int pop() {
//
//        if (isEmpty()) {
//            throw new IllegalArgumentException("Stack is empty");
//
//        }
//
//        int top = top();
//
//        head = head.next;
//
//        return top;
//
//
//    }
//
//    public int top() {
//
//        if (isEmpty()) {
//            throw new IllegalArgumentException("Stack is empty");
//
//        }
//
//        return head.data;
//    }
//
//    public boolean isEmpty() {
//        return head == null;
//    }
//}
