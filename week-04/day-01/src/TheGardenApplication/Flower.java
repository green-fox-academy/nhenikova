package TheGardenApplication;

public class Flower extends Plant {

    public Flower(String color) {
        super(5.0, color, 0.75, 0, "flower");
    }
}

//The Flower
//needs water if its current water amount is less then 5
//when watering it the flower can only absorb the 75% of the water
//eg. watering with 10 the flower's amount
// of water should only increase with 7.5