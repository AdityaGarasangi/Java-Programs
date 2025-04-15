//Define method to check the user entered number is NEON Number or not
/* NEON NUMBER --> Number where the sum of the digits of its square is equal to the original number */
package com.Numbers;
import java.util.Scanner;

public class NeonNumber {

	static boolean isNeon(int n) {
		int sq = n*n;
		int sum = 0;
		while (sq > 0) {
			int rem = sq % 10;
			sum += rem;
			sq = sq / 10;
		}
		if (sum == n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number to check if it is Neon: ");
		int num = scanner.nextInt();
		
		boolean res = isNeon(num);
		
		if (res == true) {
			System.out.println(num+" Is Neon Number");
		}
		else {
			System.out.println(num+" Is Not Neon Number");
		}
		
		scanner.close();
	}
}
