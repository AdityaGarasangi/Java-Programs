//To count how many alphabets, digits and special characters are present in the given string
package com.Numbers;

public class CountString {
	public static void main(String[] args) {
		String string = "Aditya##9663";
		int alpha = 0, digit = 0, spl = 0;
		
		for (int i = 0; i <= string.length()-1; i++) {
			char ch = string.charAt(i);
			
			if (Character.isAlphabetic(ch)) {
				alpha++;
			}
			else if (Character.isDigit(ch)) {
				digit++;
			}
			else {
				spl++;
			}
		}
		System.out.println("Number of ALPHABETS are "+alpha);
		System.out.println("Number of DIGITS are "+digit);
		System.out.println("Number of SPECIAL CHARACTERS are "+spl);
	}
}
