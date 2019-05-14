import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExercises {
    public static void main(String[] args) {

        //Exercise1
        // Write a Stream Expression to get the even numbers
        // from the following list:
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14); //first method
        numbers.stream()
                .filter(n -> n%2 ==0)
                .forEach(e -> System.out.println(e));

        List<Integer> evenNumbersList;                                  //second method
        evenNumbersList = numbers.stream()
                .filter(n -> n%2 ==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbersList);

        numbers.stream().filter(n -> n%2 ==0).forEach(System.out::println); //third method

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
        //Write a Stream Expression to get the average value of the odd
        //numbers from the following list:
        OptionalDouble averageOddNumbers;
        averageOddNumbers = numbers.stream()
                .filter(n -> !(n%2 ==0))
                .mapToInt(Integer::intValue)
                .average();
        if (averageOddNumbers.isPresent()) {
        System.out.println(averageOddNumbers.getAsDouble());
        } //handle the case, if there is nothing inside

        //method2 of exercise 4
        double oddNumbersAverage;
        oddNumbersAverage = numbers.stream()
                .filter(n -> !(n%2 ==0))
                .collect(Collectors.averagingDouble(Integer::intValue));
        System.out.println(oddNumbersAverage);

        //Exercise5
        //Write a Stream Expression to get the sum of
        //the odd numbers in the following list:
        List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        int sumOddNumbers;
        sumOddNumbers = numbers3.stream()
                .filter(n -> !(n%2 ==0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOddNumbers);

        //Exercise6
        //Write a Stream Expression to find the uppercase
        //characters in a string!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give a string: ");
        String isUp = scanner.next()
                .chars()
                .filter((c) -> Character.isUpperCase(c))
                .collect(StringBuilder::new, // supplier
                        StringBuilder::appendCodePoint, // accumulator
                        StringBuilder::append) // combiner
                .toString();
        System.out.println("The uppercase characters are " + isUp);

        //method2 of exercise 6
        String test = "njHkdAnjKBHdkrml86.85J";

        List<Character> uppersCaseCharacters = test.chars()
                .filter(c -> Character.isUpperCase(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        String joinedChar = uppersCaseCharacters.toString();
        System.out.println(joinedChar);

        //Exercise7
        //Write a Stream Expression to find the strings which starts
        //with a given letter(as parameter), in the following list:
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

    }
}
