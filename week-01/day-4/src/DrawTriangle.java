import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of lines of the triangle: ");
        int numLines = scanner.nextInt();
        String numChar = "*" ;
        for (int i=1; i<=numLines; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(numChar);
            }
            System.out.println("");
            }
        }
    }

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was