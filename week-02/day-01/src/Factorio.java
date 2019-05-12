public class Factorio {
    public static void main(String[] args) {
        int factParameter = factorio(7);
        System.out.println(factParameter);
    }

    public static int factorio (int input) {
        int factorial = 1;
        for (int i=1; i <= input; i++) {
            factorial *=i;
        }
        return factorial;
    }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
