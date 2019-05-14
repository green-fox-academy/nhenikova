import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {

    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        System.out.println(myMap.isEmpty()); //print the map isEmpty
        myMap.put(97, "a");
        myMap.put(98, "b");
        myMap.put(99, "c");
        myMap.put(65, "A");
        myMap.put(66, "B");
        myMap.put(67, "C");

        System.out.println(myMap.keySet()); //Print all the keys
        System.out.println(myMap.values()); //Print all the values

        myMap.put(68, "D");// Add value D with the key 68

        System.out.println(myMap.values().size()); //Print how many key-value pairs are in the map
        System.out.println(myMap.get(99)); //Print the value that is associated with key 99
        myMap.remove(97); //Remove the key-value pair where with key 97

        System.out.println(myMap.get(100)); //Print whether there is an associated value with key 100 or not

        myMap.clear(); //Remove all the key-value pairs
        System.out.println(myMap.isEmpty());
    }
}

/* We are going to play with maps. Feel free to use the built-in methods where possible.

        Create an empty map where the keys are integers and the values are characters

        Print out whether the map is empty or not

        Add the following key-value pairs to the map

        Key	Value
        97	a
        98	b
        99	c
        65	A
        66	B
        67	C
        Print all the keys

        Print all the values

        Add value D with the key 68

        Print how many key-value pairs are in the map

        Print the value that is associated with key 99

        Remove the key-value pair where with key 97

        Print whether there is an associated value with key 100 or not

        Remove all the key-value pairs */