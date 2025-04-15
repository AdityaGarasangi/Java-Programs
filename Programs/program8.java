import java.util.*;

class circle {
    double radius;
    final static double pi = 3.142;

    circle() {
        System.out.println("Creating 0 radius circle");
    }

    circle(double radius) {
        System.out.println("Creating a circle with radius " + radius);
        this.radius = radius;
    }

    void diameter() {
        double dia = 2 * radius;
        System.out.println("Daimeter of the circle is " + dia);
    }

    void area() {
        double area = pi * Math.pow(radius, 2);
        System.out.println("Area of the circle is " + area);
    }

    void circum() {
        double circum = 2 * pi * radius;
        System.out.printf("Circumference of the circle is %.2f ", circum);
    }

    void updateRadius(double radius) {
        System.out.println("Updating radius of circle");
        this.radius = radius;
    }
}

public class program8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        circle c1 = new circle();
        c1.diameter();
        c1.area();
        c1.circum();

        System.out.println("\n\n----------------------------------------\n\n");
        System.out.println("\nEnter the value of radius");
        double rad = scan.nextDouble();
        circle c2 = new circle(rad);
        c2.area();
        c2.diameter();
        c2.circum();
        c2.updateRadius(8);
        scan.close();

    }
}
