/*
 * Define a method square() to find square of a number, the method should accept
 * a number as a parameter and return the calculated square value. Using the
 * method square() find the answer the formula {a+b}2
 */

public class funtion6 {

    public static int square(int num) {
        int res;

        res = num * num;
        System.out.println("Square of " + num + " is " + res);
        return 0;
    }

    public static int formula(int a, int b) {
        int res;
        res = square(a) + square(b) + (2 * a * b);
        System.out.println("Answer to the given formuula is " + res);
        return 0;
    }

    public static void main(String[] args) {
        square(5);
        formula(6, 4);
    }
}