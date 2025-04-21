/*
 	        a 
      	  a b 
    	a b c 
  	  a b c d 
	a b c d e 
*/

package com.Patterns;

public class Pattern21 {
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("-----------------------------");
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print((char)(k + 96)+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}
