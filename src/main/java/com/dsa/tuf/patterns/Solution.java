package com.dsa.tuf.patterns;

//             *
//            ***
//           *****
//

import java.util.Spliterator;

class Solution {
    public void pattern7(int n) {

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
    }

    public static void main(String[] args) {

        Solution solution
                = new Solution();
        solution.pattern7(4);
    }
}