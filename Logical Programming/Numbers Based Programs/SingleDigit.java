//To print sum of each digit until getting single digit
package com.Numbers;
import java.util.Scanner;
public class SingleDigit {
	static int SumDigit(int num) {
		
		while (num > 9) {
			int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num = num / 10;
		}
			num=sum;
		}
		return num;
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Integer Number");
		int num = scanner.nextInt();
		
		System.out.println(SumDigit(num));
	
		scanner.close();
		
	}
}


