//Define a method to count how many even digits are present in the given number
package com.Numbers;

import java.util.Scanner;

public class CountEvenDigits {
	static int EvenDigits(int n)
	{
		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				count ++;
			}
			n = n / 10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the atleast 2 digit number");
		
		int num = scanner.nextInt();
		int count = EvenDigits(num);
		if (count <= 1) {
			System.out.println("Number of even digits in "+num+" is "+count);
		}
		else if (count > 1) {
			System.out.println("Number of even digits in "+num+" are "+count);
		}
		
		
		
		scanner.close();
	}
}
