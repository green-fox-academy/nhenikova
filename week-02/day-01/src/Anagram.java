import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, give me first word: ");
        String firstWord = sc.nextLine();

        System.out.println("Please, give me second word: ");
        String secondWord = sc.nextLine();

        checkingAnagram(firstWord, secondWord);
    }

    public static void checkingAnagram(String firstWord, String secondWord) {

        char[] firstArray = firstWord.toCharArray();
        char[] secondArray = secondWord.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        if (Arrays.equals(firstArray, secondArray)) {
            System.out.println("Input words are Anagrams");
        } else {
            System.out.println("Input words are not Anagrams");
        }
    }
}