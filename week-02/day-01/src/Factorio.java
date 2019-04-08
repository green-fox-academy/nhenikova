public class Factorio {
    public static void main(String[] args) {
        int factorio = factorial(7);
        System.out.println(factorio);
    }

    public static int factorial (int input) {
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
