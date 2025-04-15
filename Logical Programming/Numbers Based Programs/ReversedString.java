//To print reversed string
package com.Numbers;

public class ReversedString {
	 public static void main(String[] args) {
		String string = "ADITYA";
		String rev = " ";
		
		for (int i = string.length()-1; i >= 0; i--) {
			char ch = string.charAt(i);
			rev += ch;
		}
		
		System.out.println(rev);
	}
}
