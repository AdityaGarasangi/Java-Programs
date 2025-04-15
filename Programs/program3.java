// Creating Referemce Variable
public class program3 {
    int x = 10;
    int y = 20;

    void test() {
        System.out.println("Running test() Method..........");
    }
}

class innerprogram3 {
    public static void main(String[] args) {
        program3 ref1;
        ref1 = new program3();

        System.out.println("X value is: " + ref1.x);
        System.out.println("Y value is: " + ref1.y);
        ref1.test();

        System.out.println("\nReinintilizing Non-Static Values\n");
        ref1.x = 69;
        ref1.y = 96;

        System.out.println("X value is: " + ref1.x);
        System.out.println("Y value is: " + ref1.y);
    }
}