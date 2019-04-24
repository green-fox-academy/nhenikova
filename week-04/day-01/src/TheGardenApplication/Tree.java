package TheGardenApplication;

public class Tree extends Plant{

    public Tree(String color) {
        super(10, color, 0.4, 0, "tree");
    }

}

//The Tree
//needs water if its current water amount is less then 10
//when watering it the tree can only absorb the 40% of the water
//eg. watering with 10 the tree's amount of water should only increase with 4
