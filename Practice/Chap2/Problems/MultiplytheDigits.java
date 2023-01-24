package Problems;
import java.util.Scanner;

public class MultiplytheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10000: ");
        int numbers = input.nextInt();
        int mul = 1;
        while(numbers != 0) { // 114 11 1
            mul *= numbers % 10; // 4 1 1
//            System.out.println(mul);
            numbers = numbers / 10; // 11 1 0
        }
        System.out.println("The multiply of the digits is : " + mul);
    }
}
