// Represent mobile as a object
class mobile {
    // attributes / Fields / Data Members / States
    String Brand;
    String os;
    String version;
    double price;
    int storage;

    // Behaviours
    void updatePrice(double arg) {
        System.out.println("Updating the price of mobile: ");
        price = arg;
    }

    void updateStorage(int arg) {
        System.out.println("Updating the storage of mobile: ");
        storage = arg;
    }

    void updateVersion(String arg) {
        System.out.println("Updating the version of mobile: ");
        version = arg;
    }

    void details() {
        System.out.println("Brand: " + Brand + "\nOS: " + os + "\nVersion: " + version + "\nStorage: " + storage
                + "\nPrice: " + price);
    }
}

public class program6 {

    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.Brand = "Samsung";
        m1.os = "Android";
        m1.version = "6.9.6";
        m1.storage = 128;
        m1.price = 30000;
        m1.details();

        // Updating Fields
        System.out.println("\n\nUpdating Fields of Mobile\n\n");
        m1.updatePrice(28000);
        m1.updateStorage(256);
        m1.updateVersion("7.2.6");

        m1.details();
    }
}