//To Check if the number is even or odd
package com.Numbers;

public class EvenOrOdd {	
	public static void main(String[] args) {
		int n = 10;
		
		if (n % 2 == 0) {
			System.out.println("The given number "+n+" is even");
		}
		else if (n % 2 !=0) {
			System.out.println("The given number "+n+" is Odd");
		}
		else {
			System.out.println("Invalid Number");
		}
	}
}
