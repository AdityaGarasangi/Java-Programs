public class carPrice {

    public static void main(String[] args) {
        String name = "Varna";
        int cc = 1500;
        int price = 1345000;
        double tax = 0;
        double insurance = 0;
        double totalPrice = 0;
        // Calculating tax based on price
        if (price < 1000000) {
            tax = 0.25;
        } else if (price > 1000000 && price < 2000000) {
            tax = 0.32;
        } else if (price > 2000000 && price < 3000000) {
            tax = 0.39;
        } else if (price > 3000000) {
            tax = 0.42;
        }

        // Calculating insurance for 1 year based on CC
        if (cc < 1000) {
            insurance = 5780;
        } else if (cc > 1000 && cc < 2000) {
            insurance = 12950;
        } else if (cc > 2000 && cc < 3000) {
            insurance = 17850;
        } else if (cc > 3000) {
            insurance = 24950;
        }

        totalPrice = price + (price * tax) + (insurance * 5);
        
        System.out.println("Model Name: " + name);
        System.out.println("Car Price: " + price);
        System.out.println("Total tax: " + tax);
        System.out.println("Total Insurance: " + (insurance * 5));

        System.out.println("Grand Total: " + totalPrice);

    }
}