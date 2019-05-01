package animalprotection;

public class Animal {
    private String ownerName;
    private boolean isHealthy;
    protected int healCost;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void heal() {
        isHealthy = true;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public int getHealCost() {
        return healCost;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isAdoptable() {
        if (isHealthy == true) {
            return true;
        }
        return false;
    }

//    @Override
//    public String toString() {
//        String animalClassName = this.getClass().getCanonicalName();
//        if (isHealthy == false) {
//            return animalClassName + " is not healthy ( " + healCost + " €), and not adoptable";
//        } else{
//            return animalClassName + "is healthy and adoptable";
//        }
//    }
    //by default

    @Override
    public String toString() {
        if (isHealthy == false) {
            return name + " is not healthy (" + healCost + " €), and not adoptable";
        } else{
            return name + "is healthy and adoptable";
        }
    }
}


