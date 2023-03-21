import java.util.Scanner;

public class Minimum {
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
        System.out.println(min(myList));

    }
}
