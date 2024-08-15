package com.dsa.tuf.stacks;

import java.util.Arrays;

//Implement Queue using Arrays
class ArrayQueue {


    int arr[] = new int[10];
    int size = 0;

    public ArrayQueue() {

    }

    public void push(int x) {
        if (size > 9) {
            expandSize();

        }
        arr[size++] = x;


    }

    private void expandSize() {

        int[] newArray = new int[size * 2];
        int i = 0;
        for (int a : arr) {
            newArray[i++] = a;
        }
        arr = newArray;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Empty");
        }

        int top = peek();

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        return top;

    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Empty");
        }

        return arr[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);


        System.out.println("--" + queue.pop());
        System.out.println("--" + queue.pop());
        System.out.println("--" + queue.pop());
        System.out.println("--" + queue.pop());
        System.out.println("--" + queue.pop());
        System.out.println("--" + queue.pop());
        System.out.println("--" + queue.pop());
        System.out.println("--" + queue.pop());
        queue.print();
    }
}
