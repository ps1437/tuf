package com.dsa.tuf.patterns;

//
//*        *
//**      **
//***    ***
//****  ****
//**********
//****  ****
//***    ***
//**      **
//*        *
class Pattern20 {
    public void pattern20(int n) {


        for (int i = 0; i < n; i++) {
            for (int a = 0; a < i + 1; a++) {
                System.out.print('*');
            }
            for (int a = 0; a < (n - i - 1) * 2; a++) {
                System.out.print(' ');
            }
            for (int a = 0; a < i + 1; a++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int L = 1; L < n; L++) {
            for (int c = 0; c < n - L; c++) {
                System.out.print('*');
            }
            for (int space = 0; space < L * 2; space++) {
                System.out.print(' ');
            }
            for (int start = 0; start < n - L; start++) {
                System.out.print('*');
            }

            System.out.println();

        }


    }


    public static void main(String[] args) {
        Pattern20 solution
                = new Pattern20();
        solution.pattern20(5);
    }
}