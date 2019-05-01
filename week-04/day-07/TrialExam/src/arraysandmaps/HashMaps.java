package arraysandmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values:
        HashMap<String, Integer> sweetLovelyMap = new HashMap<>();

        // Create a HashMap with Integer keys and boolean values:
        HashMap<Integer, Boolean> anotherMap = new HashMap<>();

        // Add items:
        sweetLovelyMap.put("Riel", 1);
        sweetLovelyMap.put("Naty", 5);
        sweetLovelyMap.put("Ghost", 2);
        sweetLovelyMap.put("Naty", 2);      // will overwrite item with the same key

        anotherMap.put(2, false);


        // Find value for a key
        Integer valueForNaty = sweetLovelyMap.get("Naty");
        System.out.println(valueForNaty);

        // Get all keys: use .keySet()
        for (String key : sweetLovelyMap.keySet()) {
            System.out.println(key);
        }

        // Iterating on values: use .values()
        for (Integer value : sweetLovelyMap.values()) {
            System.out.println(value);
        }

        // Check if key is used:
        if (sweetLovelyMap.containsKey("Riel")){
            System.out.println("Yaaaaayyy, he is here!");
        } else {
            System.out.println("We miss Riel!");
        }


        // Get keys for a value (more keys can be found)
        List<String> keysForTwo = new ArrayList<>();

        // If there is only one key for the value:
        String keyForTwo = "";

        for (Map.Entry<String,Integer> item : sweetLovelyMap.entrySet()) {
            if (item.getValue() == 2){
                keysForTwo.add(item.getKey());
                keyForTwo = item.getKey();
            }
        }

        System.out.println(keyForTwo);
    }
}