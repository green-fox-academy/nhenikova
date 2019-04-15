
public class Functions {
    public static void main(String[] args) {

        String sentence = "This is the very first sentence for you to process siesta lovers";

        // Write a function that returns the longest word from a sentence passed as a String parameter

        // 1. We need to create that function.
        // 4. We need to use (call) that function, passing the required data
        // 5. We need to get the return value because we want to use it here.
        String longest = findLongestWord(sentence);
        System.out.println(longest);


        String sentence2 = "This is the second and most beautiful sentence ever";
        longest = findLongestWord(sentence2);
        System.out.println(longest);

    }

    // [STEP 1]
    // How to define a function?
    // This way: public static <return value> <method name> (<1. parameter type> <1. parameter name> , ...)
    //
    // public static                        just type it like this
    // return type -> String                   because the sum is an integer
    // method name -> findLongestWord          the name shall describe what the function does
    // 1. parameter type -> String           because we want to calculate the sum of an int[]
    // 1. parameter name -> sentence           free to give a name that is meaningful in the context of the function
    // So this function needs a String as parameter and returns a String



    // "This is the sentence"
    public static String findLongestWord(String sentence){
        // [STEP 2] the job of the function

        String[] words = sentence.split(" ");

        String longest = words[0];
        for (String word : words) {
            if (word.length()> longest.length()){
                longest = word;
            }
        }

        // [STEP 3] return the necessary value of the return type:
        return longest;
    }
}
