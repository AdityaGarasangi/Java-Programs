//Define method to check if the given number is PERFECT number or not
/* PERFECT NUMBER --> number where the sum of all its proper factors excluding itself must be equal to the number itself. */
package com.Numbers;
import java.util.Scanner;

public class PerfectNum {
	static boolean isPerfect(int num) {
		int sum = 0;
		
		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter an integer to check if it is a Perfect Number");
		int num = scanner.nextInt();
		
		boolean res = isPerfect(num);
		
		if (res) {
			System.out.println(num+" is a Perfect Number");
		}
		else {
			System.out.println(num+" is Not a Perfect Number");
		}
		
		scanner.close();
	}
}
