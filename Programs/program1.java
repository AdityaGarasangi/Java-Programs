//Accessing the object
public class program1 {
    int x = 10;
    int y = 20;

    void test() {
        System.out.println("Running test() Method............");
    }
}

class innerprogram1 {
    public static void main(String[] args) {
        program1 d1 = new program1();
        System.out.println("X value is: " + d1.x);
        System.out.println("Y value is: " + d1.y);
    }
}
