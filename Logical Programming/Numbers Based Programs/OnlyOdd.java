////Define a method to check the number contains any odd digits or not
package com.Numbers;
import java.util.Scanner;

public class OnlyOdd {
	
	static boolean OddDigit(int num) {
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				return true;
			}
			num = num / 10;
		}
		return false;	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Integer Number");
		int num = scanner.nextInt();
		
		boolean res = OddDigit(num);
		
		if (res) {
			System.out.println(num+" contains at least one odd digit");
		}
		else {
			System.out.println(num+ "  does not contain any odd digits");
		}
		scanner.close();
		
	}
}
