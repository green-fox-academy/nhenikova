import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of lines of the pyramid: ");
        int numLines = scanner.nextInt();
        String numChar = "* " ; //leave space after character ?
        for (int i=1; i<=numLines; i++) {
            System.out.println(); //change line
            for (int j=1; j<=numLines-i; j++) {
                System.out.print(" "); //leave space
            }
            for (int k=1; k<=i; k++) {
                System.out.print(numChar);//print characteristic
            }
        }

    }
}
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was