//Define Method to reverse the given number
package com.Numbers;
import java.util.Scanner;

public class ReverseNum {
	
	static int reversing(int num) {
		int revNum = 0;
		
		while(num > 0) {
			int digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		
		return revNum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Interger Number");
		int num = scanner.nextInt();
		
		System.out.println("Reversed Number: "+reversing(num));
		
		
		scanner.close();
	}
}
