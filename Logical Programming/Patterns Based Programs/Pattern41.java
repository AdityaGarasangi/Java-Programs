/*
	      1 
	    1 2 3 
	  1 2 3 4 5 
	1 2 3 4 5 6 7 
	  1 2 3 4 5 
	    1 2 3 
	      1  
*/
package com.Patterns;

public class Pattern41 {
	public static void main(String[] args) {
		int n = 7, sp = n / 2, st = 1;
		
		System.out.println("-----------------------------");
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			
			for (int k = 1; k <= st; k++) {
				System.out.print(k+" ");
			}
			
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}
