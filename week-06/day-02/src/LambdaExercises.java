import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LambdaExercises {
    public static void main(String[] args) {

        //Exercise1
        // Write a Stream Expression to get the even numbers
        // from the following list:
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream()
                .filter(n -> n%2 ==0)
                .forEach(e -> System.out.println(e));

        List<Integer> evenNumbersList;
        evenNumbersList = numbers.stream()
                .filter(n -> n%2 ==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbersList);

        numbers.stream().filter(n -> n%2 ==0).forEach(System.out::println);

        //Exercise2
        //Write a Stream Expression to get the squared value of
        //the positive numbers from the following list:
        List<Integer> squareNumbersList;
        squareNumbersList = numbers.stream()
                .filter(n -> n>0)
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println(squareNumbersList);

        //Exercise3
        //Write a Stream Expression to find which number
        //squared value is more then 20 from the following list:
        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> squaredMoreNumbersList;
        squaredMoreNumbersList = numbers2.stream()
                .filter(n -> n>0)
                .map(n -> n*n)
                .filter(n -> n>20)
                .collect(Collectors.toList());
        System.out.println(squaredMoreNumbersList);

        //Exercise4
        //Write a Stream Expression to get the average value of the odd numbers from the following list:
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    }
}
