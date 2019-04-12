public class Bunnies {
    public static void main(String[] args) {
        System.out.println(numberOfEars(3));
    }
    public static int numberOfEars  (int numberOfBunnies) {

    if ( numberOfBunnies == 1){
        return 2;
    }
    return numberOfEars(numberOfBunnies-1)+2;
}
}
//Bunnies
//We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively
// (without loops or multiplication).