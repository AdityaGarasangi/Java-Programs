//Covert User entered number from decimal to binary
package com.Numbers;
import java.util.Scanner;

public class Dec2Bin {
	static String decTobin(int num) {
		String binString = "";
		
		while (num > 0) {
			int rem = num % 2;
			binString = rem + binString;
			num = num / 2;
		}
		return binString;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Decimal Number");
		int dec = scanner.nextInt();
		scanner.close();
		
		String binary = decTobin(dec);
		System.out.println(binary);
	}
}
