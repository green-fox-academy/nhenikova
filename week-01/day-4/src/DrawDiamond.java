import java.util.Scanner;

public class DrawDiamond {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write and odd number of lines of the Diamond: ");
            int lines = scanner.nextInt();
            String numChar = "*";
            if (lines%2 == 0) {
                System.out.println("Error. Write an odd number.");
            }
            else {
                for (int i = 0; i < lines / 2 + 1; i++) {
                    for (int j = 0; j < lines / 2 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i * 2 + 1; k++) {
                        System.out.print(numChar);
                    }
                    System.out.println();
                }
                for (int i = lines / 2; i > 0; i--) {
                    for (int j = lines / 2 - i + 1; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = i * 2 - 1; k > 0; k--) {
                        System.out.print(numChar);
                    }
                    System.out.println();
                }
            }
        }
}
// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
