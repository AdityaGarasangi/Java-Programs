/*
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
*/

package com.Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("-----------------------------");

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars with a space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("-----------------------------");
    }
}
