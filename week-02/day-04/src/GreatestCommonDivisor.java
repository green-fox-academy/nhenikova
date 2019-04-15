public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(greatComDiv(60, 70, 120));
    }

    public static int greatComDiv(int num1, int num2, int divisor) {

        if (num1 % divisor == 0 && num2 % divisor == 0) {
            return divisor;
        } else {
            return greatComDiv(num1, num2, divisor - 1);
        }
    }
}

//Greatest Common Divisor
// Find the greatest common divisor of two numbers using recursion.