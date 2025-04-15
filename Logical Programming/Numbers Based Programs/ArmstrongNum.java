/*Define method to check if user entered number is ARMSTRONG NUMBER or not
 ARMSTRONG NUMBER --> Sum of power of each digit should be equal to original number
 */
package com.Numbers;
import java.util.Scanner;

public class ArmstrongNum {
	
	static boolean isArmstrong(int num) {
		String s = num + "";
		int cd = s.length();
		
		System.out.println("Number of Digits: "+cd);
		
		int sum = 0;
		int org = num;
		
		while (num > 0) {
			int rem = num % 10;
			
			int power = (int)Math.pow(rem, cd);
			System.out.println(rem+" ^ "+cd+" = "+power);
			
			sum += power;
			num = num / 10;
		}
		if (sum == org) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Integer Number");
		int num = scanner.nextInt();
		
		boolean res = isArmstrong(num);
		if (res == true) {
			System.out.println(num+" is a Armstrong Number");
		}
		else {
			System.out.println(num+" is Not a Armstrong Number");
		}
		
		scanner.close();
	}
}
