
// Write a Function to calculate area of Rectangle
import java.util.*;

public class funtion4 {

    public static void rectangle() {
        Scanner scanner = new Scanner(System.in);

        double length;
        double width;

        double area;

        System.out.println("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        width = scanner.nextDouble();

        area = length * width;

        System.out.printf("Area of the rectangle with length %.2f and width %.2f is %.2f", length, width, area);

        scanner.close();
    }

    public static void main(String[] args) {
        rectangle();
    }

}