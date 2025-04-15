//Define method to print first N Prime Number
package com.Numbers;
import java.util.Scanner;

public class FirstNPrime {
	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int i = 2;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer Number");
		int n = scanner.nextInt();
		System.out.println("First "+n+" Prime Numbers are:");
		while (true) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
				
			}
			if (count == n) {
				break;
			}
			i++;
		}
		
		scanner.close();
		
	}
}

