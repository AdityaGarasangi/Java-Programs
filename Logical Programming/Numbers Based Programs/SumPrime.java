//Define method to find sum of all odd digits and check if the sum is prime or not
package com.Numbers;
import java.util.Scanner;

public class SumPrime {
    
    static int SumOfOdd(int n) {
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;

            if (rem % 2 != 0) { 
                sum += rem;
            }
            n = n / 10;
        }
        return sum;
    }

    static boolean isPrime(int num) {
        if (SumOfOdd(num) <= 1) {
            return false;
        }

        for (int i = 2; i <= SumOfOdd(num) / 2; i++) {
            if (SumOfOdd(num) % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();

        int sumOdd = SumOfOdd(num);
        boolean res = isPrime(sumOdd); 

        System.out.println("Sum of odd digits from " + num + " is " + sumOdd);
        
        if (res) {
            System.out.println(sumOdd + " is a Prime Number.");
        } else {
            System.out.println(sumOdd + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}
