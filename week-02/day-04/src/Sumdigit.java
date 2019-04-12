public class Sumdigit {
    public static void main(String[] args) {
//        int lastDigit = getLast(123);
//        System.out.println(lastDigit);
//        int shorterDigit = getShorter(123);
//        System.out.println(shorterDigit);
        int someDigit = recursion(1234);
        System.out.println(someDigit);
    }

    public static int getLast(int number) {
        return number % 10;
    }

    public static int getShorter (int number) {
        return number / 10;
    }

    public static int recursion (int number){
        if (number < 10 && number > 0){
            return number;
        }
        return getLast(number) + recursion(getShorter(number));
    }

}

//Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/)
// by 10 removes the rightmost digit (126 / 10 is 12).