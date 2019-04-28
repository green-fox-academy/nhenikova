import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostCommonCharacters {
    public static void main(String[] args) {
        try {
           HashMap<Character, Integer> result =  mostCommonCharacter("countchar.txt");
            System.out.println(result);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static HashMap<Character, Integer> mostCommonCharacter (String filename) throws IOException {
        //read file
        Path path = Paths.get(filename);
        String allLetters = "";

        try {
            //get the content from the file
            List<String> fileData = Files.readAllLines(path);
            for (String line : fileData) {
                allLetters = allLetters + line;
            }
        } catch (IOException exception) {
            throw new IOException("File does not exist1");
            //throws an exception if it does not exist
        }
        return  getMostCommon(allLetters);
    }

    public static HashMap<Character, Integer> getMostCommon(String allLetters) {
        HashMap<Character, Integer> map = new HashMap<>();
        //process the content, build a hashmap that stores characters and occurence

        int maximumOccurence = 0;
        int maximumOccurence2 = 0;
        char mostCommonCharacter = '\u0000';
        char mostCommonCharacter2 = '\u0000';

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < allLetters.length(); i++) {
                char countedCharacter = allLetters.charAt(i);
                int occurenceOfCounted = getOccurence(allLetters, countedCharacter);
                //get all the characters
                if ((k == 0) && occurenceOfCounted > maximumOccurence) {
                    maximumOccurence = occurenceOfCounted;
                    mostCommonCharacter = countedCharacter;
                } else if (occurenceOfCounted > maximumOccurence2 && (countedCharacter != mostCommonCharacter)) {
                    maximumOccurence2 = occurenceOfCounted;
                    mostCommonCharacter2 = countedCharacter;
                }
            }
        }
        map.put(mostCommonCharacter, maximumOccurence);
        map.put(mostCommonCharacter2, maximumOccurence2);
        return map;
    }

    //another loop for counting occurences of countedCharacter
    public static Integer getOccurence (String allLetters, char countedCharacter) {
        int occurenceOfCounted = 0;
            for (int j = 0; j < allLetters.length() ; j++) {
                if(countedCharacter == allLetters.charAt(j)) {
                  occurenceOfCounted++;
                }
            }
            return occurenceOfCounted;
        }
    }

//Write a function that takes a filename as a parameter.
// Return the 2 most common characters and their occurrences in the file's content.
//
//If the file does not exist throw an exception with the following message:
// "File does not exist!"
//
//Example
//
//Example file can be found here
//
//Output
//
//{
//  "e": 6,
//  "l": 4
//}