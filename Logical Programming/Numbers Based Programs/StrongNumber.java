//Define method to check if the user entered number is STRONG Number or not
/* STRONG NUMBER --> Number where the sum of the factorial of its digits is equal to the number itself */
package com.Numbers;
import java.util.Scanner;

public class StrongNumber {
	static int SumOfFact(int n) {
		int sum = 0;
		
		while (n > 0) {
			int rem = n % 10;
			int fact = 1;
			
			for (int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			n = n / 10;
		}
		return sum;
	}
	
	static boolean isStrong(int n) {
		if (SumOfFact(n) == n) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer to check if it is a Strong Number: ");
		int num = scanner.nextInt();
		
		boolean res = isStrong(num);
		
		if (res == true) {
			System.out.println(num+" is a Strong Number");
		}
		else {
			System.out.println(num+" is Not a Strong Number");
		}
		
		
		scanner.close();
		
	}
}
