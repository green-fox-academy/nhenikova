import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[]args){

    ArrayList<String> namesList = new ArrayList<>();

        System.out.println(namesList.size()); //print the number of elements in the list

        namesList.add("William"); //add William to the list

        if(namesList.isEmpty()) {
            System.out.println("The list of names is empty!");
        } else {
            System.out.println("The list contains this elements: " + namesList); //print the list
        }

        namesList.add("John"); //add John
        namesList.add("Amanda"); //add Amanda

        System.out.println(namesList); //print names in the list

        System.out.println(namesList.size()); //print the number of elements

        System.out.println(namesList.get(2)); //print the third element

        for (String name: namesList) { //iterate through the list
            System.out.println(name);
        }

        int j = 1;
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(j + ". " + namesList.get(i)); //print 1.,2.,3.
            j++;
        }

        namesList.remove(1); //remove the second element


        for (int i = namesList.size() - 1; i >= 0; i--) { //print name in  reversed order
            System.out.println(namesList.get(i));
        }

        namesList.clear(); //remove all elements

        if(namesList.isEmpty()) {
            System.out.println("The list of names is empty!" + namesList);
        } else {
            System.out.println("The list contains this elements: " + namesList); //print the list
        }
    }

}

/* We are going to play with lists. Feel free to use the built-in methods where possible.

        Create an empty list which will contain names (strings)
        Print out the number of elements in the list
        Add William to the list
        Print out whether the list is empty or not
        Add John to the list
        Add Amanda to the list
        Print out the number of elements in the list
        Print out the 3rd element
        Iterate through the list and print out each name
        William
        John
        Amanda
        Iterate through the list and print
        1. William
        2. John
        3. Amanda
        Remove the 2nd element
        Iterate through the list in a reversed order and print out each name
        Amanda
        William
        Remove all elements */
