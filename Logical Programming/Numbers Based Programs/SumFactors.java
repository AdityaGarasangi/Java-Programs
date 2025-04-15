//To Print sum of all the factors of given number
package com.Numbers;
import java.util.Scanner;

public class SumFactors {
	public static void main(String[] args) {
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		
		System.out.println("Sum of all factors of "+num+" is "+sum);
		
		scanner.close();
	}
}
