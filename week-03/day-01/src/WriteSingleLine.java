import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        String fileName = "my-file.txt";
        String content = "My name is Naty.";
        writeIntoFile(fileName, content);
        readFromFile(fileName);
    }

    public static void writeIntoFile(String fileName, String content) {
        List<String> fileContent = new ArrayList<>();
        fileContent.add(content);

        Path filePath = Paths.get(fileName);
        System.out.println(filePath.toAbsolutePath());
        System.out.println(filePath);

        try {
            Files.write(filePath, fileContent);
        } catch (IOException error) {
            System.out.println("Unable to write file: my-file.txt.");
        }
    }

    public static void readFromFile(String nameOfTheFile) {
        Path filePath = Paths.get(nameOfTheFile);

        try {
            List<String> fileContent = Files.readAllLines(filePath);
            System.out.println(fileContent);
            for (String line : fileContent) {
                System.out.println(line);
            }
        } catch (IOException error) {
            System.out.println("Cannot read the file: my-file.txt.");
        }
    }
}

//    Write a function that is able to manipulate a file
//    By writing your name into it as a single line
//    The file should be named "my-file.txt"
//    In case the program is unable to write the file,
//    It should print the following error message: "Unable to write file: my-file.txt"