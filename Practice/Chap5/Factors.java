import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int index = 2; // Numbers to test as factors

        // Find and display all the smallest factors in increasing order
        while (number / index != 1) {
            // Test as a factor of number
            if (number % index  == 0) {
                System.out.print(index + ", ");
                number /= index;
            }
            else
                index++; // Increment index
        }
        System.out.println(number + ".");
    }
}
