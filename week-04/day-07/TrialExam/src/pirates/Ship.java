package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Pirate> pirates;
    private int workForBattle;

    public Ship() {
        this.pirates = new ArrayList<>();
        this.workForBattle = 5;
    }

    public void addPirate(Pirate newPirate) {
        if (newPirate.setIsCaptain(); && newPirate.getIsCaptain()) {
            this.pirates.add(newPirate);
            newPirate.getIsCaptain() = false;
        } else {
            this.pirates.add(newPirate);
        }
    }

    public String getPoorPirates() {
        for (Pirate pirate : pirates) {
            if(pirate.getHasWoodenLeg() == true && pirate.getAmountOfGold() < 15) {
            return;
            }
        }
    }

    public int getGolds() {

    }


}
