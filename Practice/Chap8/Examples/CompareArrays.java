import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] list1 = getArray();
        System.out.print("Enter list2: ");
        int[][] list2 = getArray();

        System.out.println("The two arrays are" + (equals(list1, list2)? " " : " not ") + "identical");
    }

    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
        final int COLS = 3;
        int[][] m = new int[ROWS][COLS];
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = input.nextInt();
            }
        }
        return m;
    }

    public static boolean equals(int[][] m1, int[][] m2){
        int[] list1 = sort(m1);
        int[] list2 = sort(m2);
        for (int i = 0; i <list1.length; i++) {
            if(list1[i] != list2[i])
                return false;
        }
        return true;
    }

    public static int[] matrixToArray(int[][] m){
        int[] list = new int[m.length * m[0].length];
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                list[k] = m[i][j];
                k++;
            }
        }
        return list;
    }

    public static int[] sort(int[][] m){
        int[] list = matrixToArray(m);

        for (int i = 0; i < 3; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = 0; j < 3; j++) {
                if(min > list[j]){
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
        return list;
    }
}
