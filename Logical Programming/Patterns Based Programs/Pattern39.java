/*
	      * 
	    * * * 
	  * * * * * 
	* * * * * * * 
	  * * * * * 
	    * * * 
	      * 
*/
package com.Patterns;

public class Pattern39 {
    public static void main(String[] args) {
        int n = 7, sp = n / 2, st = 1;
        
        System.out.println("-----------------------------");
        for (int i = 1; i <= n; i++) {
        	
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            
            for (int k = 1; k <= st; k++) {
            	System.out.print("* ");
            }
            
            if (i <= n / 2) {
				sp --;
				st += 2;
			} else {
				sp ++;
				st -= 2;
			}
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
