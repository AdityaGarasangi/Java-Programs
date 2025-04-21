/*
		* 
		* * 
		* * * 
		* * * * 
		* * * 
		* * 
		*  
*/

package com.Patterns;

public class Pattern43 {
	public static void main(String[] args) {
		int n = 7, st = 1;
		
		System.out.println("-----------------------------");
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= st; j++) {
				System.out.print("* ");
			}
			
			if (i <= n / 2) {
				st += 1;
			}
			else {
				st -= 1;
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}