import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int matrixDimension = 4;
        int [][] matrix = new int[matrixDimension][matrixDimension];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix [i][j] = 1;
                } else {
                    matrix [i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix [i][j]);
            }
            System.out.println();
        }
    }
}

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Size of the matrix: ");
//        int matrixSize = scanner.nextInt();
//        int[][] matrix = new int[matrixSize][matrixSize];
//        for (int i = 0; i < matrixSize; i++) {
//            matrix[i][i] = 1;
//            System.out.println(Arrays.toString(matrix[i]));
//        }


// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output