import java.util.Scanner;

public class guessgame {

    public static void guessin() {
        Scanner scan = new Scanner(System.in);
        int num = 1 + (int) (100 * (Math.random()));
        int k = 10;

        System.out.println("A Number has been choosen between 1 to 100\n");
        System.out.println("You have " + k + " attempts to guess the number\n");

        for (int i = 0; i < k; i++) {
            System.out.print("\nEnter your guess: ");
            int guess = scan.nextInt();

            if (guess == num) {
                System.out.println("\n\nCongratulations! You guessed the correct number " + num);
                System.out.println("\n\n");
                scan.close();
                return;
            } else if (guess > num) {
                System.out.println("The number is less then " + guess);
            } else if (guess < num) {
                System.out.println("The number is greater than " + guess);
            }
        }

        System.out.println("\nYou've exhausted all attempts. The correct number was: \n" + num);

        scan.close();
    }

    public static void main(String[] args) {
        guessin();
    }
}