package com.dsa.tuf.patterns;

//
//**********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
class Pattern19 {
    public void pattern19(int n) {


        for (int i = 0; i < n ; i++) {
            for (int a = 0; a < n - i; a++) {
                System.out.print('*');
            }
            for (int a = 0; a < i*2;a++) {
                System.out.print(' ');
            }
            for (int a = 0; a < n - i; a++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int L = 0; L < n ; L++) {
            for (int start1 = 0; start1 < L + 1; start1++) {
                System.out.print('*');
            }
            for (int space = 0; space < (n  - L-1) * 2; space++) {
                System.out.print(' ');
            }
            for (int start = 0; start < L + 1; start++) {
                System.out.print('*');
            }

            System.out.println();

        }


    }


    public static void main(String[] args) {
        Pattern19 solution
                = new Pattern19();
        solution.pattern19(5);
    }
}