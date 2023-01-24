package Problems;

import java.util.Scanner;

public class CalculateEnergy {
    public static void main(String[] args) {
        double energy = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        double water = input.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double initialT = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finalT = input.nextDouble();

        energy = water * (finalT - initialT) * 4184;
        System.out.println("The energy needed is "+energy);

    }
}
