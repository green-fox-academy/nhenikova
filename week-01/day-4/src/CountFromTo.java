import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write two numbers. System will count all numbers between both of them.");
        System.out.println("Insert the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Insert the second number: ");
        int secondNumber = scanner.nextInt();
        if (firstNumber >= secondNumber) {
            System.out.println("The second number should be bigger!");
        }
        for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.println(i);
        }
    }
}

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
