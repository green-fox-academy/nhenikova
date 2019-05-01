package arraysandmaps;

public class Arrays {
    public static void main(String[] args) {
        // Create an Array of strings
        String[] names = new String[3];
        names[0] = "Riel";
        names[1] = "Naty";
        names[2] = "Ghost";

        // Create an Array of integers
        Integer[]  numbers = {3, 20, 1};

        // add  - can not (size is fixed)

        // get item
        String second = names[1];

        // insert to index  - can not (size is fixed)

        // remove from index  - can not (size is fixed)


        // iterate
        // for ( [type of the item] [name - free choice] : [name of list] ){
        // }
        for (String name : names) {
            System.out.println(name);
        }

        // iterate also:
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }

        // count elements
        int elements = names.length;

        // clear (values can change only)
        for (int i = 0; i < names.length ; i++) {
            names[i] = "";
        }

        // calculate sum of numbers:
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
    }
}