/*
 * 1.Print all Even Index Values
 * 2. Print all Even Elements Values
 */

public class array4 {

    static int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

    public static void evenIndex() {
        System.out.println("Printing all even index from array");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void evenElements() {
        System.out.println("Printing all even elements from array");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("");
        evenIndex();
        System.out.println("");
        evenElements();
    }
}