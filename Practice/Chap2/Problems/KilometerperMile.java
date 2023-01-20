package Problems;

import java.util.Scanner;
public class KilometerperMile {
    public static void main(String[] args) {
//        double miles = 100;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number for miles: ");
      double miles = input.nextDouble();
      final double kilometerPerMile = 1.609;
      double kilometers = miles * kilometerPerMile;

        System.out.println("Kilometers: " + kilometers);
    }
}
