//Convert secounds into hours and minutes
package com.Numbers;
import java.util.Scanner;

public class Sec2Hrs {
	static void secToHr(int user_provided_sec) {
		
		int hr = user_provided_sec / 3600;
        int rem = user_provided_sec % 3600;
        int min = rem / 60;
        int sec = rem % 60;
		
        String hourStr = "Hours";
        String minStr = "Minutes";
        String secStr = "Seconds";

        if (hr == 1) {
            hourStr = "Hour";
        }

        if (min == 1) {
            minStr = "Minute";
        }

        if (sec == 1) {
            secStr = "Second";
        }
        

        System.out.println(hr + " " + hourStr + " " + min + " " + minStr + " " + sec + " " + secStr);
	} 
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Seconds: ");
		int sec = scanner.nextInt();
		scanner.close();

		secToHr(sec);
	}
}
