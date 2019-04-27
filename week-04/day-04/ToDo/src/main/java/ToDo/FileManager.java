package ToDo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public List<String> readFile(String fileName) {
        Path path = Paths.get(fileName);
        try {
            return Files.readAllLines(path);
        } catch (IOException ex) {
            System.out.println("Sorry I couldn't read the file");
        }
        return new ArrayList<>();
        //new Error and throw exception
    }

    public void writeFile(String fileName, List<String> content) {
        Path path = Paths.get(fileName);
        try {
            Files.write(path, content);
        } catch (IOException ex) {
            System.out.println("Could not write the file!");
        }
    }

}
