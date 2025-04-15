
//Write a Function to calculate area of Triangle
import java.util.*;;

public class funtion3 {
    public static void area() {
        Scanner scanner = new Scanner(System.in);

        double base;
        double height;

        double res;

        System.out.println("Enter the Base value of Triangle: ");
        base = scanner.nextDouble();
        System.out.println("Enter the Height value of Triangle: ");
        height = scanner.nextDouble();

        res = (base * height) / 2;
        System.out.printf("Area of Triangle with Base %.2f and Height %.2f is %.2f", base, height, res);

        scanner.close();
    }

    public static void main(String[] args) {
        area();
    }
}
