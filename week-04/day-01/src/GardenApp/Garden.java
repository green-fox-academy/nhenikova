package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants = new ArrayList<>();

    public void printStatus() {
        for (Plant plant : this.plants) {
            System.out.println("Iam a " + getType() + " with color of " + color);
        }
    }

    public String getType() {
        return this.getClass().getTypeName();
        if
    }

    public void waterPlants(int waterAmount) {
        System.out.println("Watering plant's with: " + waterAmount);

        List<Plant> thirstyPlants = this.getThirstyPlants();
        int amountOfWaterToWaterEachPlant = waterAmount / this.thirstyPlants.size();

        for (Plant plant : this.thirstyPlants) {
            plant.water(waterAmount);
        }
    }

    public void addTree(String color) {
        this.plants.add(new Plant(color));
    }

    public void addFlower() {
        this.plants.add(new Plant(color));

    }

    public List<Plant> getThirstyPlants() {
        List<Plant> thirstyPlants = new ArrayList<>();

        for (Plant plant : this.plants) {
            if (plant.isNeedingWater())
        }
    }
}
