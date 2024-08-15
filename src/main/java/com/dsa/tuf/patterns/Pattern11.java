package com.dsa.tuf.patterns;
//
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

class Pattern11 {
    public void pattern11(int n) {
        int data = 0;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                data = 1;
            } else {
                data = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(data);
                data = 1 - data;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Pattern11 solution
                = new Pattern11();
        solution.pattern11(4);
    }
}