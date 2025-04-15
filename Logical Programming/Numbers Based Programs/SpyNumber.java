//Define method to check if the given number is SPY Number or not
package com.Numbers;
import java.util.Scanner;

public class SpyNumber {
	static boolean isSpy(int n) {
		int sum = 0;
		int product = 1;
		
		while (n > 0) {
			int rem = n % 10;
			
			sum += rem;
			product *= rem;
			
			n = n/10;
		}
		if (sum == product) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Integer Number: ");
		int n = scanner.nextInt();
		
		boolean res = isSpy(n);
		
		if (res == true) {
			System.out.println(n+" Is Spy Number");
		}
		else {
			System.out.println(n+" Is Not Spy Number");
		}
		
		scanner.close();
	}
}
