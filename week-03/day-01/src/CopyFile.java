import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String fileName = "my-lines.txt";
        String content = "My name is Naty.";
        writeIntoFile(fileName, content);

        Path sourceFile = Paths.get(fileName);
        Path newFile = Paths.get("my-copy-lines.txt");

        if (CopyFile(sourceFile, newFile)) {
            System.out.println("Copy was succesfully created.");
        }
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

    public static boolean CopyFile(Path sourceFile, Path newFile) {
        try {
            Files.copy(sourceFile, newFile);
            return true;
        } catch (IOException error) {
            System.out.println();
            return false;
        }
    }
}

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
