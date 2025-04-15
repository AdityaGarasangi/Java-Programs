//Define method to check if the given number is prime Number or not
/*PRIME NUMBER --> Number that has exactly two factors: 1, Itself*/
package com.Numbers;
import java.util.Scanner;

public class PrimeNum {
	static boolean isPrime(int n) {
		
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
			return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num = scanner.nextInt();
		
		boolean res = isPrime(num);
		
		if (res) {
			System.out.println(num+" is Prime Number");
		}
		else {
			System.out.println(num+" is Not Prime Number");
		}
		
		scanner.close();
	}
}
