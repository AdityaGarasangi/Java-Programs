/*
	        * 
	      *   * 
	    *       * 
	  *           * 
	* * * * * * * * *  
*/
package com.Patterns;

public class Pattern28 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("-----------------------------");
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars and spaces for hollow effect
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || i == n || k == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
