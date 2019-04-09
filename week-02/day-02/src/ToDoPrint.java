import java.util.ArrayList;
import java.util.Arrays;

public class ToDoPrint {
    public static void main(String... args){
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        String todoText = " - Buy milk";
        String beginString = "My todo:";
        String endString = " - Download games";
        String stringIndent = "\t - Diablo";

        String newTodoText = "";
        newTodoText = newTodoText.join("\n", beginString, todoText, endString, stringIndent);

        System.out.println(newTodoText);
    }
}