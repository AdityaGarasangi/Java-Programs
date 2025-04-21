/*
	        A 
	      B B B 
	    C C C C C 
	  D D D D D D D 
	E E E E E E E E E 
*/

package com.Patterns;

public class Pattern24 {
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("-----------------------------");
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print((char)(i + 64)+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}
