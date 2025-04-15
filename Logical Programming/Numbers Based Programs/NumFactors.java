//To print factors or divisors for the given number
package com.Numbers;
import java.util.Scanner;

public class NumFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		System.out.println("Factors of "+num+" are ");
		
		System.out.println("1");
		
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}	
		}
		System.out.println(num);
		scanner.close();
	}
}
