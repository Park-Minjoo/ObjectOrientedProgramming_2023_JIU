import java.util.Scanner;

public class Sum2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = 3, col = 4;
        double [][] matrix = new double[row][col];

        System.out.println("Enter a 3-by-4 matrix by row: ");

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < matrix[0].length ; i++) {
                System.out.println("Sum of the element at columns " + i + " is " + sumColumn(matrix, i));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }

}
