import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {
    public static void main(String[] args) {
        List<String> swearWord = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"));
        System.out.println(removeSwearWords("content.txt", swearWord));

    }

    public static int removeSwearWords(String filename, List wordsToRemove) {
        List<String> swearWords = new ArrayList<>();
        List<String> lines;
        String[] words;
        try {
            Path filePath = Paths.get(filename);
            lines = Files.readAllLines(filePath);
        } catch (Exception e) {
            System.out.println("fuck it");
            return 0;
        }
        for (String line : lines) {
            words = line.split(" ");
            for (String word : words) {
                if (wordsToRemove.contains(word.toLowerCase())) {
                    swearWords.add(word);
                }
            }
        }
        return swearWords.size();
    }
}

//Write a method which can read and parse a file containing not so family friendly text.
// The method must remove all the given words from the file and return the amount of the removed words.