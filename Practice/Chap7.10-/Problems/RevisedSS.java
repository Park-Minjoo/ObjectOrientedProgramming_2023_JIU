import java.util.Scanner;

public class RevisedSS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10]; // Create an array of length 10

        // Prompt the user to enter ten numbers
        System.out.print("Enter ten numbers (double): ");
        for (int i = 0; i < numbers.length ; i++)
            numbers[i] = input.nextDouble();

        // Invoke selectionSort
        selectionSort(numbers);

        // Display the sorted numbers
        for (double e: numbers)
            System.out.print(e + " ");
        System.out.println();
    }

    /** selectionSort sorts array in accending order */
    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            // Find the maximum in the list[i+1...list.length]
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMax] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
