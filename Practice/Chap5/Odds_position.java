import java.util.Scanner;

public class Odds_position {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        String oddPositions = "";	// Hold the characters at odd positions

        // Concat that characters in the string at odd positions
        for (int i = 0; i < string.length(); i+=2) {
            oddPositions += string.charAt(i);
        }

        // Display results
        System.out.println(oddPositions);
    }
}
