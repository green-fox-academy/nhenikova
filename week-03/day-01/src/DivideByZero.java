import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the number: ");
        int divisor = scanner.nextInt();
        System.out.println("Here is the result: ");

        try{
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException error) {
            System.out.println("Can't divide by zero.");
        }
    }
}


// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0