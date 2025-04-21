/*
	*       * 
	* *     * 
	*   *   * 
	*     * * 
	*       * 
*/
package com.Patterns;

public class Pattern32 {
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("-----------------------------");
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				
				if (j == 1 || j == n || i == j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}