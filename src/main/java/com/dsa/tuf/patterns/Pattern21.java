package com.dsa.tuf.patterns;

class Pattern21 {
    public void pattern21(int n) {

//        for (int i = 1; i <= n; i++) {
//
//
//            if (i == 1 || n == i) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print('*');
//                }
//            } else {
//
//                System.out.print('*');
//
//                for (int k = 0; k < n - 2; k++) {
//                    System.out.print(' ');
//                }
//                System.out.print('*');
//
//            }
//            System.out.println();
//
//
//        }

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                if(i == 0 || j == 0 || i == n-1 || j == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern21 pattern21
                = new Pattern21();
        pattern21.pattern21(5);
    }
}