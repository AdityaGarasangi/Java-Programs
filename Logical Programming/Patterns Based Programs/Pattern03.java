/*
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
*/
package com.Patterns;

public class Pattern03 {
	public static void main(String[] args) {
		System.out.println("-------------");
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		System.out.println("-------------");
	}
}
