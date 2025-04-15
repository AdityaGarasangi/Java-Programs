//Define a method to print sum of each digit present in given number
package com.Numbers;
import java.util.Scanner;

public class SumDigits {
	static int SumOfDigits(int num) {
		int sum = 0;
		
		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num = num / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num = scanner.nextInt();
		
		int res = SumOfDigits(num);
		
		System.out.println("Sum of each digit from "+num+" is "+res);
		
		scanner.close();
	}
}
