//Define a method to print the nearest prime number of the user entered number
package com.Numbers;
import java.util.Scanner;

public class NearestPrime {
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
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter Integer Number");
		int num = scanner.nextInt();
		scanner.close();
		
		if (isPrime(num)) {
			System.out.println(num);
			return;
		}
		
		int previous = num - 1;
		int next = num + 1;
			
		while (true) {
			if (isPrime(previous)) {
				System.out.println(previous);
				break;
			}
			if (isPrime(next)) {
				System.out.println(next);
				break;
			}
			previous--;
			next++;
		}
	}
}
