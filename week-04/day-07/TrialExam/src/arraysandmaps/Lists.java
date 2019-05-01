package arraysandmaps;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> names = new ArrayList<>();

        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();


        // add items
        names.add("Riel");      // index 0
        names.add("Naty");      // index 1 ...
        names.add("Ghost");

        numbers.add(3);
        numbers.add(20);
        numbers.add(1);


        // get item
        String second = names.get(1);

        // insert item to index
        names.add(1, "Adam");

        // remove from index
        names.remove(1);

        // iterate
        // for ( [type of the item] [name - free choice] : [name of list] ){
        // }
        for (String name : names) {
            System.out.println(name);
        }

        // you can use this one also
        for (int i = 0; i < names.size() ; i++) {
            System.out.println(names.get(i));
        }

        // count elements
        int elements = names.size();

        // calculate sum of numbers:
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        // clear
        names.clear();
    }
}
