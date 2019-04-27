package TheGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants = new ArrayList<>();

    Flower yellowFlower = new Flower("yellow");

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void watering(double amount) {
        int thirstyPlants = 0;
        for (Plant thirstyPlant : plants) {
            if (thirstyPlant.isThirsty()) {
                thirstyPlants++;
            }
        }
        for (Plant plantsToWater : plants ) {
            if (plantsToWater.isThirsty()) {
                plantsToWater.water(amount / thirstyPlants);
            }
        }
    }

    public void status() {
        for (Plant p : plants) {
            System.out.println(p);
        }
    }
}


//The Garden
//is able to hold unlimited amount of flowers or trees
//when watering it should only water those what
// needs water with equally divided amount amongst them
//eg. watering with 40 and 4 of them need water
// then each gets watered with 10