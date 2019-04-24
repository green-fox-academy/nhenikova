package TheGardenApplication;

public class Plant {
    String color;
    double amountOfWater;
    double neededWater;
    double absorbing;
    String type;

    public Plant(double neededWater, String color, double absorbing, double amountOfWater, String type) {
        this.color = color;
        this.neededWater = neededWater;
        this.absorbing = absorbing;
        this.amountOfWater = amountOfWater;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public int getAmountOfWater() {
        return (int)amountOfWater;
    }

    public void water(double amount) {
        amountOfWater += amount * absorbing;
    }

    public boolean isThirsty() {
        if(amountOfWater < neededWater) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "The " + color + " " + type + (isThirsty() ? " needs water" : " doesnt need water");
    }
}
