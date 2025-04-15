//Convert user entered num form decimal to octal
package com.Numbers;
import java.util.Scanner;

public class Dec2Oct {
	static String decTooct(int num) {
		String octString = "";
		
		while (num > 0) {
			int rem = num % 8;
			octString = rem + octString;
			num = num / 2;
		}
		return octString;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Decimal Number");
		int dec = scanner.nextInt();
		scanner.close();
		
		String binary = decTooct(dec);
		System.out.println(binary);
	}
}
