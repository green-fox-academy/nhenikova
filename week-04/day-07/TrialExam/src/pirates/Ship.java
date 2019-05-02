package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Pirate> pirates;

    public Ship() {
        this.pirates = new ArrayList<>();
    }

    public void addPirate(Pirate newPirate) {
        if (newPirate.getIsCaptain()) {
            for (Pirate pirate : pirates) {
               if(pirate.getIsCaptain()) {
                   return;
               }
            }
        }
        pirates.add(newPirate);
    }

    public List<Pirate> getPoorPirates() {
        List<Pirate> poorPirates = new ArrayList<>();
        for (Pirate pirate : pirates) {
            if(pirate.getHasWoodenLeg() && pirate.getAmountOfGold() < 15) {
            poorPirates.add(pirate);
            }
        }
        return poorPirates;
    }

    public int getGolds() {
    int golds = 0;
        for (Pirate pirate : pirates) {
            golds += pirate.getAmountOfGold();
        }
        return golds;
    }

    public void lastDayOnTheShip() {
        for (Pirate pirate : pirates) {
            pirate.party();
        }
    }

    public void prepareForBattle() {
        for (int i = 0; i < 5 ; i++) {
            for (Pirate pirate : pirates) {
                pirate.work();
            }
        }

        lastDayOnTheShip();
    }

    @Override
    public String toString() {
        String result = "";
        for (Pirate pirate : pirates) {
            result += ("name: " + pirate.getPirateName() + ", gold: " + pirate.getAmountOfGold() + ", health: " + pirate.getHealthPoints() +
                    ", captain: " + pirate.getIsCaptain() + ", wooden leg: " + pirate.getHasWoodenLeg() + "\n");
        }
        return result + "Golds: " + this.getGolds() + "\n" + "Number of poor pirates: " + this.getPoorPirates().size() + "\n";
    }



}
