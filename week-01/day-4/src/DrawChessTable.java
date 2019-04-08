import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert numbers of rows: ");
        int numRows = scanner.nextInt();
        System.out.println("Insert numbers of columns: ");
        int numColumns = scanner.nextInt();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++){
                if ((i+j)%2 == 0) {
                    System.out.print("% ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//