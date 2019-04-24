package TheGardenApplication;

public class Main {
    public static void main(String[] args) {
        Garden gardenOfEden = new Garden();
        gardenOfEden.addPlant(new Flower("yellow"));
        gardenOfEden.addPlant(new Flower("blue"));
        gardenOfEden.addPlant(new Tree("orange"));
        gardenOfEden.addPlant(new Tree("purple"));

        gardenOfEden.status();
        System.out.println();
        gardenOfEden.watering(40);
        gardenOfEden.status();
        System.out.println();
        gardenOfEden.watering(70);
        gardenOfEden.status();
    }
}


//The task is to create a garden application, so in your main method
// you should create a garden with flowers and trees.
// The program should demonstrate an example garden with
// two flowers (yellow and blue) and two trees (purple and orange).
// In the example after creating them you should show the user,
// how the garden looks like. After that the program should water
// the garden twice, first with the amount of 40 then with 70.
// And after every watering the user should see the state of
// the garden as you can see in the output.
//
//The output should look like this:
//
//The yellow Flower needs water
//The blue Flower needs water
//The purple Tree needs water
//The orange Tree needs water
//
//Watering with 40
//The yellow Flower doesnt need water
//The blue Flower doesnt need water
//The purple Tree needs water
//The orange Tree needs water
//
//Watering with 70
//The yellow Flower doesnt need water
//The blue Flower doesnt need water
//The purple Tree doesnt need water
//The orange Tree doesnt need water