public class Animal {
    private int hunger;

    public Animal(int hunger) {
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public void eat(int food) {
        if (food > 0) {
            hunger = hunger - food;
        }
    }
}
