//Define method to find n power p without using Math Library
package com.Numbers;
import java.util.Scanner;

public class nPowerP {
	static int powerCal(int n, int p) {
		int res = 1;
		
		for (int i = 0; i < p; i++) {
			res *= n;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n = scanner.nextInt();
		
		System.out.println("Enter the value of p");
		int p = scanner.nextInt();
		
		int result = powerCal(n, p);
		System.out.println(n+" ^ "+p+" is "+result);
		
		scanner.close();
	}
}
