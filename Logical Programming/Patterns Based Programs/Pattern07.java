/*
 	1 0 1 0 1 
	0 1 0 1 0 
	1 0 1 0 1 
	0 1 0 1 0 
	1 0 1 0 1 
 */

package com.Patterns;

public class Pattern07 {
	public static void main(String[] args) {
		int x = 1;
		System.out.println("-----------------------------");
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				System.out.print(x%2+" ");
				x++;
				
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}
