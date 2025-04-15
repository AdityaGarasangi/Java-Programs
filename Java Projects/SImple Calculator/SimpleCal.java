import java.util.Scanner;

public class SimpleCal {

    // Method to perform calculation
    public static double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }
                return num1 / num2;
            case "%":
                if (num2 == 0) {
                    System.out.println("Error: Modulus by zero is not allowed.");
                    return Double.NaN;
                }
                return num1 % num2;
            default:
                System.out.println("Invalid Operator. Please try again!");
                return Double.NaN;
        }
    }

    // Main method for input and output
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, %): ");
        String operator = scanner.next();

        double result = calculate(num1, num2, operator);

        if (!Double.isNaN(result)) {
            System.out.println("Result of " + num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close();
    }
}
