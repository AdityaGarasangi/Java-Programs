/*
 * 1.Print only first half of array
 * 2. Print only last half of the array
 */
public class array3 {
    static int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

    public static void firstHalf() {
        System.out.println("Printing Only First Half of the Array");
        for (int i = 0; i < arr.length; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void lastHalf() {
        System.out.println("Printing Only Last Half of the Array");
        for (int i = 5; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("");
        firstHalf();
        System.out.println("");
        lastHalf();
    }
}
