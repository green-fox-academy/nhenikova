import java.util.Arrays;
class MultiplyMatrix {
    public static void main(String[] args) {
        int array[][] = {{1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}};
        Multiply(array);
        printMatrix(array);
        System.out.print(Arrays.toString(Multiply(array)));  // Arrays.toString(Multiply(array))) function toString
    }
    public static int[][] Multiply(int[][] inputMatrix) {  // returns datatype which was inserted
        for (int row = 0; row < inputMatrix.length; row++) {
            for (int column = 0; column < inputMatrix.length; column++) {
                if (row % 2 == 0 && inputMatrix[row][column] % 2 == 0) {
                    inputMatrix[row][column] *= 2;
                } else if (row % 2 != 0 && inputMatrix[row][column] % 2 != 0) {
                    inputMatrix[row][column] *= 2;
                }
            }
        }
        return inputMatrix;
    }
    public static void printMatrix(int[][] inputMatrix) {
        for (int row = 0; row < inputMatrix.length; row++) {
            for (int i = 0; i < inputMatrix.length; i++) {
                System.out.print(inputMatrix[row][i]);
            }
        }
    }
}