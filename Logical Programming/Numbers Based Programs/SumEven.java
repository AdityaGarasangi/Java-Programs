//To print sum of all even numbers present between 1 and 100
package com.Numbers;

public class SumEven {
	static int SumOfEven() {
		int sum = 0;
		System.out.println("Even Numbers are");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(" "+i+" ");
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of all even numbers between 1 and 100 is "+SumOfEven());
	}
}
