package com.dsa.tuf.patterns;
//
//        1        1
//        12      21
//        123    321
//        1234  4321
//        1234554321

class Pattern12 {
    public void pattern12(int n) {
        int spaces = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

            spaces -= 2;
        }


    }

    public static void main(String[] args) {

        Pattern12 solution
                = new Pattern12();
        solution.pattern12(4);
    }
}