import java.util.Scanner;

public class ParametricAvarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of integers: ");
        int numInt = scanner.nextInt();
        int count = numInt;
        int counter = 0;
        System.out.println();
        while (count > 0) {
            System.out.println("Add Number: ");
            counter += scanner.nextInt();
            count--;
        }
        System.out.println("Sum: " + counter + " " + "Average: " + (counter/numInt));
    }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4