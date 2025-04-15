// Reinitilizing Static Valriable
public class program2 {
    static int x = 10;
    static int y = 10;

    void test() {
        System.out.println("Running test() Method............");
    }
}

class innerprogram2 {
    public static void main(String[] args) {
        System.out.println("X value is: " + program2.x);
        System.out.println("Y value is: " + program2.y);

        program2.x = 100;
        program2.y = 500;
        System.out.println("\nAfter Reinitializing...........\n");
        System.out.println("X Value is: " + program2.x);
        System.out.println("Y Value is: " + program2.y);
    }

}