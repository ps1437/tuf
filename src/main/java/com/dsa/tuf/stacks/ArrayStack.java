package com.dsa.tuf.stacks;

class ArrayStack {
    int arr[] = new int[10];
    int size = 0;

    public ArrayStack() {
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

        int top = top();
        arr[size - 1] = 0;
        size--;
        return top;
    }


    public int top() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Empty");
        }

        return arr[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
