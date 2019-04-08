public class Sum {
    public static void main(String[] args) {
        int sumResult = sum(5);
        System.out.println(sumResult);

    }
    public static int sum (int input){
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        return sum;
    }

}
// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter