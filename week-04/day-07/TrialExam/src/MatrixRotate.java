public class MatrixRotate {
    public static void main(String[] args) {
        int[][] inputMatrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] rotatedMatrix = rotateMatrix(inputMatrix);
        System.out.println("Rotated Matrix :");
        printMatrix(rotatedMatrix);
    }

    private static int[][] rotateMatrix (int[][] inputMatrix) {
        int totalRowsOfRotatedMatrix = inputMatrix[0].length; //Total columns of Original Matrix
        int totalColsOfRotatedMatrix = inputMatrix.length; //Total rows of Original Matrix

        int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                rotatedMatrix[j][ (totalColsOfRotatedMatrix-1)- i] = inputMatrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    private static void printMatrix(int[][] inputMatrix){
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                System.out.print(inputMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
//Create a function named rotateMatrix
// that takes an n×n integer matrix (array of arrays)
// as parameter and returns a matrix which elements
// are rotated 90 degrees clockwise.
//
//Example
//Input
//
//[
//  [1, 2, 3],
//  [4, 5, 6],
//  [7, 8, 9]
//]
//Output
//
//[ [ 7, 4, 1 ],
//  [ 8, 5, 2 ],
//  [ 9, 6, 3 ]
//]