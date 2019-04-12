import java.util.ArrayList;

public class NumberAdder {

    public static void main(String[] args) {
        System.out.println(addNumber(5));
    }

    public static int addNumber (int n){
        if (n <= 1) {
            return 1;
        }
        return n + addNumber(n - 1);
    }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
