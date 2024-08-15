package com.dsa.tuf.patterns;
//
//             *
//          ***
//          *****
//          *******
//          *******
//          *****
//          ***
//          *


class Pattern9 {
    public void pattern9(int n) {

        for (int i = 0; i < n; i++) {

            //spaces
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

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

        Pattern9 solution
                = new Pattern9();
        solution.pattern9(4);
    }
}