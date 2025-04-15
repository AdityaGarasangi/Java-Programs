//To print smallest among 4 numbers
package com.Numbers;

public class Small4 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 40;
		int small = a;
		
		if (b < small) {
			small = b;
		}
		if (c < small) {
			small = c;
		}
		if (d < small) {
			small = d;
		}
		System.out.println(small);
	}
}
