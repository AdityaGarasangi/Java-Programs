// Null Pointer Exception
public class program4 {
    int x = 10;
    int y = 20;

    void test() {
        System.out.println("Running test() Method..........");
    }
}

class innerprogram4 {
    public static void main(String[] args) {
        program4 d1;
        d1 = new program4();
        System.out.println(d1);
        System.out.println("X value is: " + d1.x);
        System.out.println("Y value is: " + d1.y);
        d1.test();

        program4 d2 = d1;

        System.out.println(d2);
        System.out.println("X value is: " + d2.x);
        System.out.println("Y value is: " + d2.y);
        d2.test();
    }
}