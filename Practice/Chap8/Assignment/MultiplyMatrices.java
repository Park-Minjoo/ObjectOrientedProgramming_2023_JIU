import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        int m, n1, n2, p;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of matrix A (m x n): ");
        m = input.nextInt();
        n1 = input.nextInt();

        System.out.print("Enter size of matrix B (n x p): ");
        n2 = input.nextInt();
        p = input.nextInt();

        double [][] A = new double[m][n1];
        double [][] B = new double[n1][p];
        if (n1 != n2) System.out.println("Error: These matrices cannot be multiplied");
        else{
            System.out.print("Enter matrix A: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n1; j++) {
                    A[i][j] = input.nextDouble();
                }
            }
            System.out.print("Enter matrix B: ");
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < p; j++) {
                    B[i][j] = input.nextDouble();
                }
            }
            System.out.println("The multiplication of the matrices is");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println(" * ");

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println();
            }

            multiplyMatrix(A, B);

        }


    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double [][] C = new double[a.length][b[0].length];
//        System.out.println(a.length + " " + b[0].length);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b[0].length; k++) {
                    C[i][j] += a[i][k] * b[k][j];
                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        return C;
    }
}
