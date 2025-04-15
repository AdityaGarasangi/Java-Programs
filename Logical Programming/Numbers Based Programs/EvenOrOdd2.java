//To check given number is even or odd without using Modules Operator "%"
package com.Numbers;

public class EvenOrOdd2 {
	public static void main(String[] args) {
		int n = 13;
		if (n / 2 * 2 == n) {
			System.out.println("The given number "+n+" is even");
		}
		else if (n / 2 * 2 != n) {
			System.out.println("The given number "+n+" is Odd");
		}
		else {
			System.out.println("Invalid Operator");
		}
	}
}
