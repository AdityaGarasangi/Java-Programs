
//Write a Function to calculate addition of 2 numbers
import java.util.*;

public class funtion1 {

    public static void add() {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double res;
        System.out.println("Enter 2 values: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        res = num1 + num2;

        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + res);

        scanner.close();
    }

    public static void main(String[] args) {
        add();

    }

}
