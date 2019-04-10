import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {

    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        System.out.println(myMap.isEmpty());
        myMap.put(97, "a");
        myMap.put(98, "b");
        myMap.put(99, "c");
        myMap.put(65, "A");
        myMap.put(66, "B");
        myMap.put(67, "C");
        for (Integer key : myMap.keySet()
        ) {
            System.out.println(key);
        }
        for (String value : myMap.values()
        ) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String>entry : myMap.entrySet()
        ) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        myMap.put(68, "D");
        System.out.println(firstMap.size());
        System.out.println(firstMap.get(99));
        myMap.remove(97);
        System.out.println(firstMap.get(100));
        if (myMap.get(100) != null) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        myMap.clear();
    }
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