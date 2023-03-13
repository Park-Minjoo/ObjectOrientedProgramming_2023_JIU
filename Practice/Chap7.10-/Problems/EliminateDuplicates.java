import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter the number: ");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        int[] distinct = eliminateDuplicates(numbers);

        System.out.println("The distinct numbers are : ");

        for(int e: distinct){
            if (e > 0){
                System.out.print(" " + e);
            }
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list){
        int len = list.length;

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[len];
        int[] newList = new int[len];
        int j = 0;

        for (int i = 0; i < len - 1; i++) {
            if (list[i] != list[i + 1]) {
                temp[j++] = list[i];
            }
        }

//        temp[j++] = list[len - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            list[i] = temp[i];
        }

        return temp;
    }


}
