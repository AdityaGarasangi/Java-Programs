//Define a method to check the number contains only even digits or not
package com.Numbers;
import java.util.Scanner;

public class OnlyEven {
	
	static boolean EvenDigit(int num) {
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				return false;
			}
			num = num / 10;
		}
		return true;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Integer Number");
		int num = scanner.nextInt();
		
		boolean res = EvenDigit(num);
		
		if (res) {
			System.out.println(num+" Contains Only Even Digits");
		}
		else {
			System.out.println(num+ " Does Not Contain Only Even Digits.");
		}
		scanner.close();
		
	}
}