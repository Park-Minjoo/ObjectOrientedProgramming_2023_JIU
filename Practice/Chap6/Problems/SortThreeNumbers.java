import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner

        // Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Display numbers in increasing order
        displaySortedNumbers(number1, number2, number3);
    }

    /** displaySortedNumbers Method displays three numbers in increasing order */
    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        double temp; // Hold number to swap

        if (num2 < num1 && num2 < num3){ // 2 1 3
            temp = num1; // temp = 2
            num1 = num2; // num1 = 1
            num2 = temp; // num2 = 2
        }
        else if (num3 < num1 && num3 < num2) { // 2 3 1
            temp = num1;
            num1 = num3;
            num3 = temp;
            // 1 2 3
        }
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Display result
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
