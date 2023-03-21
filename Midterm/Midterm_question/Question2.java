import java.util.Scanner;

public class Question2 {
    public static double max(double[] myList){
        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }
        return max;
    }

    public static double min(double[] myList){
        double min = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
                indexOfMax = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        double myList[] = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the inputs: ");
        for (int i = 0; i < 10; i++){
            myList[i] = input.nextDouble();
        }
        System.out.println("The maximum value is : " + max(myList) + " and the minimum value is : " + min(myList));

    }
}
