package com.dsa.tuf.patterns;

//        *********
//        *******
//        *****
//        ***
//        *

import java.util.Spliterator;

class Pattern8 {
    public void pattern8(int n) {

        for (int i = 0; i < n; i++) {
            //spaces
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((n * 2 - 1) - (2 * i)); j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }

    public static void main(String[] args) {

        Pattern8 solution
                = new Pattern8();
        solution.pattern8(4);
    }
}