/*
		*     * * * * 
		*     *       
		*     *       
		* * * * * * * 
		      *     * 
		      *     * 
		* * * *     *  
*/
package com.Patterns;

public class Pattern38 {
    public static void main(String[] args) {
        int n = 7; // should be odd

        System.out.println("-----------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Top half
                if (i < n / 2) {
                    if (j == 0 || j == n / 2 || i == 0 && j >= n / 2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                // Middle row
                else if (i == n / 2) {
                    System.out.print("* ");
                }
                // Bottom half
                else {
                    if (j == n / 2 || j == n - 1 || i == n - 1 && j <= n / 2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
