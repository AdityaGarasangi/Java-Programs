/*
 * 1. Print all elements in forward direction
 * 2. Print all elements in backward direction
 */

public class array1 {

    static int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

    public static void forward() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.print("");
        }
    }

    public static void reverse() {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
            System.out.print("");
        }
    }

    public static void main(String[] args) {
        forward();
        System.out.println(" ");
        reverse();
    }
}