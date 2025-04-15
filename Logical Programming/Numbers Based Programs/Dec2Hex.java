//Convert Decimal to Hexadecimal
package com.Numbers;
import java.util.Scanner;

public class Dec2Hex {
	static String decTohex(int num) {
		String hexString = "";
		
		while (num > 0) {
			int rem = num % 16;
			if (num > 9) {
				hexString = (char)(rem + 55) + hexString;
			}
			else {
				hexString = rem + hexString;
			}
			num = num / 16;
		}
		return hexString;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Decimal Number");
		int dec = scanner.nextInt();
		scanner.close();
		
		String binary = decTohex(dec);
		System.out.println(binary);
	}
}
