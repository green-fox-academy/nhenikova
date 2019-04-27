package GardenApp;

import TheGardenApplication.Garden;

public class Main {
    public static void main(String[] args) {

        Garden gardenOfEden = new Garden();
        fillTheGardenWithTreesAndFlowers(gardenOfEden);

        gardenOfEden.printStatus();
        gardenOfEden.waterPlants(40);
        gardenOfEden.printStatus();
        gardenOfEden.waterPlants(70);
        gardenOfEden.printStatus();
    }

    public static void fillTheGardenWithTreesAndFlowers(Garden garden) {
        garden.addTree("purple");
        garden.addTree("orange");
        garden.addFlower("yellow");
        garden.addFlower("blue");
    }
}

