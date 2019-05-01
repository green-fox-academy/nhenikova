package animalprotection;

import java.util.Random;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        setHealingCost();
    }

    private void setHealingCost() {
        Random random = new Random();
        healCost = random.nextInt(8)+1;
        //healing cost of the dog should be a random number between 1 and 8
    }
}
