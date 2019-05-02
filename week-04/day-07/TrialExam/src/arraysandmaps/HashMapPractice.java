package arraysandmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        // Food and prices
        HashMap<String,Integer> firstMap  = new HashMap<>();
        firstMap.put("Burger", 140);
        firstMap.put("Eggs", 5);
        firstMap.put("Ramen", 240);
        firstMap.put("Hrschikovicha", 20);
        firstMap.put("Burger", 240);

        // Student and strength
        HashMap<Student,Integer> thirdMap  = new HashMap<>();
        thirdMap.put(new Student(78, "SpiderMan", false), 78);

        // Food and producer
        HashMap<String,String> secondMap  = new HashMap<>();
        secondMap.put("Burger", "MC");
        secondMap.put("Eggs", "Chicken");
        secondMap.put("Ramen", "RamenPrague");
        secondMap.put("Hrschikovicha", "Kreschek");


        // Get the second item from the firstMap
        // Think it over buddy: you just cannot

        // Get value for a key: price of the "Ramen":
        int priceForRamen = firstMap.get("Ramen");

        // Get key(s) for a value
        int value = 240;
        for (Map.Entry<String,Integer> item : firstMap.entrySet()) {
            // gets the value: item.getValue();
            // gets the key: item.getKey();

            if (item.getValue() == 240){
                System.out.println(item.getKey());
            }
        }

        // calculate the average of the prices of the food
        int sum = 0;
        for (Integer price : firstMap.values()) {
            sum += price;
        }

        double average = (double)sum / firstMap.size();
    }
}