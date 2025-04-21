/*
	* * * * * 
	*         
	*   * * * 
	*       * 
	* * * * *  
*/
package com.Patterns;

public class Pattern35 {
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("-----------------------------");
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				
				if (
					    i == 1 ||                          
					    i == n ||                          
					    j == 1 ||
					    i == n ||             
					    i == n / 2 + 1 && j >= n / 2 + 1 ||
					    j == n && i >= n / 2 + 1
					){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
	
}