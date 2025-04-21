/*
 	1 
	B B 
	3 3 3 
	D D D D 
	5 5 5 5 5 
*/

package com.Patterns;

public class Pattern17 {
	public static void main(String[] args) {
		int n = 5;

		System.out.println("-----------------------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print((char)(i + 64)+" ");
				}
				else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}
