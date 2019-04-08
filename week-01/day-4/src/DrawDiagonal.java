import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of the length/width of the square: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++){
            if(i==0 || i == number-1) {
                for(int j = 0; j < number; j++)
                    System.out.print("%");
                }
            else {
                    System.out.print("%");
                    for (int j=1; j < number-1; j++){
                        if (j == i){
                            System.out.print("%");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("%");
                }
            System.out.println();
            }

        }
    }


// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
