/*
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 
		1 2 
		1  
*/
package com.Patterns;

public class Pattern45 {
	public static void main(String[] args) {
		int n = 7, st = 1;
		
		System.out.println("-----------------------------");
		for (int i = 1; i <= n ; i++) {
			
			for (int j = 1; j <= st; j++) {
				System.out.print(j+" ");
			}
			
			if (i <= n / 2) {
				st++;
			}
			else {
				st--;
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}