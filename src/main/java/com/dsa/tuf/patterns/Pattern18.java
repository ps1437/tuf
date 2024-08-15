package com.dsa.tuf.patterns;

class Pattern18 {
    public void pattern18(int n) {


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                int value = n - i -1+ j;
                char print = (char) ('A' + value);
                System.out.print(print);
            }
            System.out.println();


        }


    }



    public static void main(String[] args) {
        Pattern18 solution
                = new Pattern18();
        solution.pattern18(5);
    }
}