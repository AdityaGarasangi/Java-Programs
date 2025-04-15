//To print BIGGEST among 3 Numbers using if statements
package com.Numbers;

public class Big3 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		int big = a;
		if (b > big) {
			big = b;
		}
		if (c > big) {
			big = c;
		}
		System.out.println(big);
	}
}