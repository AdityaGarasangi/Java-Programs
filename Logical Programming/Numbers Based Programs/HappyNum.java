/*
 * Define a method to check the user entered number is happy number or not
 * HAPPY NUMBER --> Sum of square of each digit until getting single digit and the single digit should be 1
*/ 
package com.Numbers;
import java.util.Scanner;

public class HappyNum {
	static int SumOfSquare(int num) {
		
		while (num > 9) {
			int sum = 0;
			
			while (num > 0) {
				
				int rem = num % 10;
				int sq = rem * rem;
				sum += sq;
				num = num / 10;
				
			}
			num = sum;
		}
		return num;
	}
	
	static boolean isHappy(int num) {
		if (SumOfSquare(num) == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Integer Number:");
		int n = scanner.nextInt();
		scanner.close();
		
		boolean res =  isHappy(n);
		if (res) {
			System.out.println(n+" is a Happy Number!");
		}
		else {
			System.out.println(n+" is Not a Happy Number!");
		}
	}
}
