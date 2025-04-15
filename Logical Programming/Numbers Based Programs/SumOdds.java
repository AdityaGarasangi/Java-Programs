//Define a method to print sum of all odd digits present in given number
package com.Numbers;

import java.util.Scanner;

public class SumOdds {
	static int SumOfOdds(int n)
	{
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 != 0) {
				sum += rem;
			}
			n = n / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the atleast 2 digit number");
		int num = scanner.nextInt();
		
		int sum = SumOfOdds(num);
		
		System.out.println("The sum of all odd digits from "+num+" is "+sum);
		
		scanner.close();
	}
}
