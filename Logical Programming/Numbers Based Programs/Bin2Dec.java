//Convert Binary to Decimal
package com.Numbers;
import java.util.Scanner;

public class Bin2Dec {
	static int binTodec(int num) {
		
		int sum = 0;
		String s1 = "" + num;
		int len = s1.length();
		int power = 0;
		int n = 2, p = 0;
		
		while (len > 0) {
			int rem = len % 10;
			power = (int) Math.pow(n, p);
			sum = sum + (rem * power);
			len--;
			p++;
			
			num = num / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Decimal Number");
		int dec = scanner.nextInt();
		scanner.close();
		
		int binary = binTodec(dec);
		System.out.println(binary);
	}
}
