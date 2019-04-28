public class SymetricMatrix {
    public static void main(String[] args) {
        int[][] symmetricMatrix = {{1, 0, 1},
                                  {0, 2, 2},
                                  {1, 2, 5}};

        int[][] notSymmetricMatrix = {{7, 7, 7},
                                      {6, 5, 7},
                                      {1, 2, 1}};

        int[][] anotherSymmetricMatrix = {{6, 7, 8},
                                          {2, 5, 7},
                                          {1, 2, 6}};

        System.out.println("Testing isSymmetric");
        System.out.println(isSymmetric(symmetricMatrix)); //return true
        System.out.println(isSymmetric(notSymmetricMatrix)); //return false
        System.out.println(isSymmetric(anotherSymmetricMatrix)); //return false

        System.out.println("Testing anotherIsSymmetric");
        System.out.println(anotherIsSymmetric(symmetricMatrix)); //return false
        System.out.println(anotherIsSymmetric(notSymmetricMatrix)); //return false
        System.out.println(anotherIsSymmetric(anotherSymmetricMatrix)); //return true
    }

    public static boolean isSymmetric (int[][] inputMatrix) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (inputMatrix[i][j] != inputMatrix[j][i]) {
                    System.out.println("The first indexes where matrix is not symmetric " + i + " and " + j);
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean anotherIsSymmetric (int[][] inputMatrix) {
        int lastIndex = inputMatrix.length - 1;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (inputMatrix[lastIndex - i][lastIndex - j] != inputMatrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

//Create a function named isSymmetric that takes an n×n
// integer matrix (two dimensional array/list) as a parameter and
// returns true if the matrix is symmetric or false if it is not.
//
//Symmetric means it has identical values along its diagonal axis
// from top-left to bottom-right, as in the first example.
//
//Example 1:
//
//[
//  [1, 0, 1],
//  [0, 2, 2],
//  [1, 2, 5]
//]
//Output:
//
//true
//Example 2:
//
//[
//  [7, 7, 7],
//  [6, 5, 7],
//  [1, 2, 1]
//]