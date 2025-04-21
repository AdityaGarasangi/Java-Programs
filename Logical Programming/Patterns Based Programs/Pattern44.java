/*
		* * * * * * * 
		* * * * * 
		* * * 
		* 
		* * * 
		* * * * * 
		* * * * * * * 
*/
package com.Patterns;

public class Pattern44 {
	public static void main(String[] args) {
		int  n = 7, st = n;
		
		System.out.println("-----------------------------");
		for (int i = 1; i <= n; i++) {
			
			for (int k = 1; k <= st; k++) {
				System.out.print("* ");
			}
			
			if (i <= n / 2) {
				st -= 2;
			}
			else {
				st += 2;
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}