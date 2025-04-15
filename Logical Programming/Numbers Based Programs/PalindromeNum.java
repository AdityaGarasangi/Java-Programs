//Define Method to check if the user entered number is palindrome or not
package com.Numbers;
import java.util.Scanner;

public class PalindromeNum {
	
	static int reversing(int num) {
		int revNum = 0;
		
		while(num > 0) {
			int digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		
		return revNum;
	}
	
	static boolean isPalindrome(int num) {
		if (reversing(num) == num) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an Interger Number: ");
		int num = scanner.nextInt();
		
		boolean res = isPalindrome(num);
		
		if (res) {
			System.out.println("Provided Number: "+num+"\nReversed Number: "+reversing(num)+"\nHence "+num+" is a Palindrome Number");
		}
		else {
			System.out.println("Provided Number: "+num+"\nReversed Number: "+reversing(num)+"\nHence "+num+" is a Not Palindrome Number");
		}
		
		
		scanner.close();
	}
}