/*
 	*
 	* *
 	* * *
 	* * * *
 	* * * * *
*/
package com.Patterns;

public class Pattern11 {
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				
					System.out.print(" * ");			
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}
