import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of the length/width of the square: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number; j++) {
                if(i==1 || j==1 || i==number || j==number) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was
