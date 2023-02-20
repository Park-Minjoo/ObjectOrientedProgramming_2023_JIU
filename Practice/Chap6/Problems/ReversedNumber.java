import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("Display and integer reversed:");

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Display the reversal of number
        reverse(number);
    }

    /** Reverse Method displays an integer in reverse order */
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println();
    }
}
