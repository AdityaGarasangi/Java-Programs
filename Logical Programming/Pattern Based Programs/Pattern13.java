/*
 	1
 	1 2
 	1 2 3
 	1 2 3 4
 	1 2 3 4 5 
*/
package com.Patterns;

public class Pattern13 {
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				
					System.out.print(j+" ");			
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}
