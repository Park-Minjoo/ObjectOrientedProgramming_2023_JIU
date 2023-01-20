package Problems;
import java.util.Scanner;

public class SumtheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int miles = input.nextInt(); // 932
        int sum = 0;
        while(miles != 0) {
            sum += miles % 10; // 2 3 9
            miles = miles / 10; // 93 9 0
        }
        System.out.println("The sum of the digits is : " + sum);
    }
}
