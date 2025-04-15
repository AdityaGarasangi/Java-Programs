//Define a method to print product of each digit present in given number
package com.Numbers;
import java.util.Scanner;

public class ProductDigits {
	static int ProductOfDigits(int n)
	{
		int product = 1;
		while (n > 0) {
			int rem = n % 10;
			product *= rem;
			n = n / 10;
		}
		return product;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the atleast 2 digit number");
		
		int num = scanner.nextInt();
		int product = ProductOfDigits(num);
		System.out.println("The product of each digit from "+num+" is "+product);
		
		
		scanner.close();
	}
}
