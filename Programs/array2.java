/*
 * 1. Print all data except first and last element
 * 2. Print all data except first 2 and last 2 element
 */
public class array2 {
    static int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

    public static void except1() {
        System.out.println("Printing All data except 1st and last element");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == 9) {
                continue;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void except2() {
        System.out.println("Printing All data except first 2 and last 2 element");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == 1 || i == 8 || i == 9) {
                continue;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("");
        except1();
        System.out.println("");
        except2();
    }
}
