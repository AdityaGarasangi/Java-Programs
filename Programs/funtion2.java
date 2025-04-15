
/* Write a Function to calculate area of Circle */
import java.util.*;

public class funtion2 {
    public static void area() {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.142;
        double rad;
        double area;
        System.out.println("Enter the value of radius");
        rad = scanner.nextDouble();

        area = 2 * pi * rad;

        System.out.println("Area of circle with radius " + String.format("%.2f", rad) + " is: "
                + String.format("%.2f", area));

        scanner.close();
    }

    public static void main(String[] args) {
        area();
    }
}
