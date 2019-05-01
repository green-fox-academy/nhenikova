package animalprotection;

import java.util.Random;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        setHealingCost();
    }

    private void setHealingCost() {
        Random random = new Random();
        healCost = random.nextInt(7);
        //healCost = (int)(Math.random() * 7);
        //healing cost of the cat should be a random number between 0 and 6
    }
}
