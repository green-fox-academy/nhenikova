import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilometers: ");
        int kilometer = scanner.nextInt();
        System.out.println("Miles: " + kilometer*1.609344);

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

    }

}
