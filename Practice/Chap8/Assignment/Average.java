import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Enter a 4-by-b matrix row by row: ");
        Scanner input = new Scanner(System.in);
        int row = 4, col = 4;
        double matrix[][] = new double[row][col];
        double total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < col; i++) {
            System.out.println("Average of the elements at column" + i + " is " +  averageColumn(matrix,i));
            total += averageColumn(matrix, i);
        }

        System.out.println("Total Average is " + total / row);

    }
    
    public static double averageColumn(double[][] m, int columnIndex){
        double average = 0;
        for (int i = 0; i < m[columnIndex].length; i++) {
            average += m[columnIndex][i];
        }
        average /= 4;
        return average;
    }
}
