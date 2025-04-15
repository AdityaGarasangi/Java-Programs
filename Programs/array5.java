/*
 * 1. Print Sum of all array elements
 * 2. Print Product of all array elements
 */

public class array5 {

    static int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

    public static void sum() {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Sum of all array elements is " + sum);
    }

    public static void product() {
        double product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.print("Sum of all array elements is " + product);
    }

    public static void main(String[] args) {
        System.out.println(" ");
        sum();
        System.out.println(" ");
        product();
    }
}