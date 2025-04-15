/*
 * Define the method findTotalPrice() to find total price of the 5 products. The
 * method accepts product price in double type array. The findTotalPrice() should
 * call getCalculation() method to find gst get on the sum of 5 products. The
 * findTotalPrice() should return final price with gst amount
 */

public class funtion7 {

    public static void getCalculation() {
        double gst = 0.18;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum += sum * gst;
        System.out.println("Sum of all 5 products is " + sum);
    }

    public static double findTotalPrice(double[] totalPrice) {
        // getCalculation();

        double sum = 0;
        for (double d : totalPrice) {
            sum += d;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        double[] arr = { 499, 599, 99, 299, 899 };
        double totalPrice = findTotalPrice(arr);
        findTotalPrice();
    }
}