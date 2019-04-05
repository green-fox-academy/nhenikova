import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number one: ");
        int numberOne = scanner.nextInt();
        System.out.println("Insert the number two: ");
        int numberTwo = scanner.nextInt();
        if (numberOne >= numberTwo) {
            System.out.println(numberOne);
        } else {
            System.out.println(numberTwo);
        }
    }
    // Write a program that asks for two numbers and prints the bigger one
}
