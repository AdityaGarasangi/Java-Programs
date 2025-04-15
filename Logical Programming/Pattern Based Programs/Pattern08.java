/*
	5 5 5 5 5
	4 4 4 4 4
	3 3 3 3 3
	2 2 2 2 2
	1 1 1 1 1
*/
package com.Patterns;

public class Pattern08 {
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		int x = 5;
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				System.out.print(x+" ");
			}
			x--;
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}
