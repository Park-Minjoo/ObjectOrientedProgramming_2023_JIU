import java.util.Scanner;

public class Maximum {
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

    public static void main(String[] args) {
        double myList[] = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the inputs: ");
        for (int i = 0; i < 10; i++){
            myList[i] = input.nextDouble();
        }
        System.out.println(max(myList));

    }
}
