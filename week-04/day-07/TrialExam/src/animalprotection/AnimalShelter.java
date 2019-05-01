package animalprotection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalShelter {
    private int budget;
    private List<Animal> animals;
    private List<String> adopterNames;

    public AnimalShelter() {
        budget = 50;
        animals = new ArrayList<>();
        adopterNames = new ArrayList<>();

        animals.add(new Cat("catcat"));
        animals.add(new Cat("pancake"));
        animals.add(new Cat("sausege"));
    }

    public int rescue(Animal animalToRescue) {
        animals.add(animalToRescue);
        return animals.size();
    }

    //find not healthy animal
    //check if animal can be healed (budget)
    //if can be healed: heal it and return 1
    //if can be healed: return 0
    public int heal() {
        for (Animal animal : animals) {
            if (animal.isHealthy() == false) {
                if(animal.getHealCost() <= budget) {
                    animal.heal(); //heal the animal
                    return 1;
                }
                return 0;
            }
        }
        return 0;
    }

    //method takes a name as a parameter and saves as potentional new owners
    public void addAdopter(String adopter) {
    adopterNames.add(adopter);
    }

    public void findNewOwner() {
        if(!animals.isEmpty() && !adopterNames.isEmpty()) {
            //select random animal
            int randomIndex = (new Random()).nextInt(animals.size());
            Animal randomAnimal = animals.get(randomIndex);
            //select random adopter
            int randomIndex2 = (new Random()).nextInt(adopterNames.size());
            String randomAdopterName = adopterNames.get(randomIndex2);
            //pair them together
            randomAnimal.setOwnerName(randomAdopterName);
            //remove animals and owner
            animals.remove(randomAnimal);
            adopterNames.remove(randomAdopterName);
        }
    }

    public int earnDonation(int amount) {
        budget += amount;
        return budget;
    }

    @Override
    public String toString() {
        String animalData = "";
        for (Animal animal : animals) {
            animalData += animal.toString() + "\n";
        }

        return "Budget: " + budget + "€,\n"
                + "There are " + animals.size() + " animal(s) and " + adopterNames.size()
                + " potentional adopter(s)" + "\n" + animalData;
    }


}
