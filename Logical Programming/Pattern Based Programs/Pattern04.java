/*
 	1 1 1 1 1
 	0 0 0 0 0
 	1 1 1 1 1
 	0 0 0 0 0
 	1 1 1 1 1 
 */
package com.Patterns;

public class Pattern04 {
	public static void main(String[] args) {
		System.out.println("---------------");
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				System.out.print(i % 2+" ");
				}
			
			System.out.println();
		}
		System.out.println("---------------");
	}
}
