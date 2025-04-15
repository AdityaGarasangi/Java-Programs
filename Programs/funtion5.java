// Write a Function to calculate area of square

import java.util.*;

public class funtion5 {

    public static void square() {
        Scanner scanner = new Scanner(System.in);

        double length;
        double area;

        System.out.println("Enter the lenght of the square: ");
        length = scanner.nextDouble();

        area = length * length;
        System.out.printf("Area of the square with lenght %.2f is %.2f", length, area);

        scanner.close();
    }

    public static void main(String[] args) {
        square();
    }

}