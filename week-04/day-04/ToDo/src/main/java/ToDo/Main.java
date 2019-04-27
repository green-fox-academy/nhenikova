package ToDo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Command Line Todo application\n" +
        "=============================\n" +
        "\n" +
        "Command line arguments:\n" +
        "-l\t Lists all the tasks\n" +
        "-a\t Adds a new task\n" +
        "-r\t Removes a task\n" +
        "-c\t Completes a task\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell me what to do: ");
        String nextCommand = scanner.nextLine();
        String fileName = "todos.txt";
        FileManager fileManager = new FileManager();
        List<String> content =  fileManager.readFile(fileName);
        //read the file and print items with numbers
        if (nextCommand.equals("l")) {
            System.out.println(content);
            for (int i = 0; i < content.size(); i++) {
                String line = content.get(i);
                //count the number to the line
                int numberToPrint = i + 1;
                System.out.println(numberToPrint + " - " + line);
            }
            if (content.size() == 0) {
                if (content.isEmpty()) {
                    System.out.println("No todos for today! :)");
                }
            }
        } else if (nextCommand.equals("a")) {
            System.out.println("Please write your new todo: ");
            String newTodo = scanner.nextLine();
            if(newTodo.isEmpty()) {
                System.out.println("Unable to add: no task provided.");
            } else {
                System.out.println("Your new todo was addes to the list.");
                //ask the user for new todo
                //add new todo to the list
                String checkListTodo = "[ ]" + newTodo;
                content.add(checkListTodo);
                //write it to the file
                fileManager.writeFile(fileName, content);
            }
        } else if (nextCommand.equals("r")) {
            //read the file and remove one item
            System.out.println("Please write which item to remove: ");
            int indexOfItem;
            try {
                indexOfItem = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Unable to remove: index is not a number");
                return; //not reading more
            }
            if (indexOfItem > content.size()) {
                System.out.println("Unable to remove: index" + indexOfItem + "is out of bound");
            } else {
                content.remove(indexOfItem - 1);
                fileManager.writeFile(fileName, content);
            }
        } else if(nextCommand.equals("c")) {
             //ask for index anc check it
            System.out.println("Insert the index to complete the taks: ");
            int indexOfCompletion;
            try {
                indexOfCompletion = scanner.nextInt();
            } catch (InputMismatchException ex) {
            System.out.println("Unable to remove: index is not a number");
            return;
            }
            if(indexOfCompletion >= content.size()) {
                System.out.println("Unable to remove: index" + indexOfCompletion + "is out of bound");
            } else {
                String checkTodo = content.get(indexOfCompletion - 1).replace("[ ]", "[x]");
                //save it to the list
                content.set(indexOfCompletion - 1, checkTodo);
                //save it to the file
                fileManager.writeFile(fileName, content);
            }
        } else {
            System.out.println("Choose an action from the list please.");
        }

    }
}
