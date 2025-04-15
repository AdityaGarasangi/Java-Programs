//Represent notebook as a object

class notebook {
    String pages;
    String type;
    String Brand;
    String price;

    void open() {
        System.out.println("Opening.......");
    }

    void close() {
        System.out.println("closeing.........");
    }

    void turnpages() {
        System.out.println("Turning..........");
    }

    void tearpages() {
        System.out.println("Tearing........");
    }

}

public class program5 {

    public static void main(String[] args) {
        notebook n1 = new notebook();
        n1.Brand = "ClassMate";
        n1.type = "Ruled";
        n1.pages = "200";
        n1.price = "69";

        System.out.println(n1.Brand);
        System.out.println(n1.type);
        System.out.println(n1.pages);
        System.out.println(n1.price);
    }
}