package pirates;

public class Pirate {
    private String pirateName;
    private int amountOfGold;
    private int healthPoints;
    private boolean isCaptain;
    private boolean hasWoodenLeg;
    //pirate has a name, amount of gold, health points
    //pirate might be a captain and may have a wooden leg

    public Pirate(String pirateName, int amountOfGold) {
        this.pirateName = pirateName;
        this.amountOfGold = amountOfGold;
        this.healthPoints = 10;
    }
    //default value of health points is 10


    public Pirate(boolean isCaptain, boolean hasWoodenLeg) {
        this.isCaptain = false;
        this.hasWoodenLeg = false;
    }

    public boolean getIsCaptain() {
        return isCaptain;
    }

    public void setIsCaptain(boolean captain) {
        isCaptain = captain;
    }

    public int getAmountOfGold() {
        return amountOfGold;
    }

    public boolean getHasWoodenLeg() {
        return hasWoodenLeg;
    }

    public String getPirateName() {
        return pirateName;
    }

    public void work() {
        if (isCaptain == true) {
            amountOfGold += 10;
            healthPoints -= 5;
        } else {
            amountOfGold += 1;
            healthPoints -= 1;
        }
    }
    //work() increases amount of gold by 10 and decrease HP by 5, if pirate is a captain
    //if pirate is not a captain increases amount of gold by 1 and decrease HP by 1

    public void party() {
        if (isCaptain == true) {
            healthPoints += 10;
        } else {
            healthPoints += 1;
        }
    }
    //party() increases HP by 10, if pirate is a captain
    //if pirate is not a captain increases HP by 1

    @Override
    public String toString() {
        if (hasWoodenLeg == true) {
            return "Hello, I'm " + pirateName + ". I have a wooden leg and " + amountOfGold + " golds.";
        } else{
            return "Hello, I'm " + pirateName + ". I still have my real legs and " + amountOfGold + " golds.";
        }
    }
}
