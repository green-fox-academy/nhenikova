package animalprotection;

import java.util.Random;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
        setHealingCost();
    }

    private void setHealingCost() {
        Random random = new Random();
        healCost = random.nextInt(7)+4;
        //healing cost of the parrot should be a random number between 4 and 10
    }
}
