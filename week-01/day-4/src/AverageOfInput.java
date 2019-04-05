import  java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First integer: ");
        int numOne = scanner.nextInt();
        System.out.println("Second integer: ");
        int numTwo = scanner.nextInt();
        System.out.println("Third integer: ");
        int numThree = scanner.nextInt();
        System.out.println("Fourth integer: ");
        int numFour = scanner.nextInt();
        System.out.println("Fifth integer: ");
        int numFive = scanner.nextInt();
        int sum = numOne + numTwo + numThree + numFour + numFive;
        double avg = sum / 5;
        System.out.println("Sum: " + sum + ", " + "Average: " + avg);

    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    // Sum: 22, Average: 4.4
    }
}
