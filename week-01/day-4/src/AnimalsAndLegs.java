import java.util.Scanner;

public class AnimalsAndLegs {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Number of chickens: ");
            int chickens = scanner.nextInt();
            System.out.println("Number of pigs: ");
            int pigs = scanner.nextInt();
            System.out.println("Number of animal's legs: " + (chickens*2 + pigs*4));

            // Write a program that asks for two integers
            // The first represents the number of chickens the farmer has
            // The second represents the number of pigs owned by the farmer
            // It should print how many legs all the animals have

        }
}
