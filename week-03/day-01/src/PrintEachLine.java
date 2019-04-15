import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
    String fileName = "my-file.txt";
    readFromFile(fileName);
    }

    public static void readFromFile(String nameOfTheFile) {
        Path filePath = Paths.get(nameOfTheFile);

        try {
            List<String> fileContent = Files.readAllLines(filePath);
            for (String line : fileContent) {
                System.out.println(line);
            }
        } catch (IOException error) {
            System.out.println("Can't read the file.");
        }
    }
}

    // Write a program that opens a file called "my-file.txt", then prints
    // each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"

