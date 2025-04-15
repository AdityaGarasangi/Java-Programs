//Define method to find the factorial of a given number
package com.Numbers;
import java.util.Scanner;

public class NumFactorials {
	static int fact(int n) {
		int fact = 1;
		if (n == 1 || n == 0) {
			fact = 1;
		}
		
		for (int i = 1; i <= n ; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num = scanner.nextInt();
		
		int res = fact(num);
		
		System.out.println("Factorial of "+num+" is "+res);
		
		
		scanner.close();
	}
}
