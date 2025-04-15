//Define a method to print all the leap year between 2000 to 2500
package com.Numbers;

public class ListLeapYr {
	static void isLeap()
	{
		for (int i = 2000; i <= 2500; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				System.out.println(i);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		isLeap();
	}
}
