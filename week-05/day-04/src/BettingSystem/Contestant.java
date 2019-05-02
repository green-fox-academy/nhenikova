package BettingSystem;

public class Contestant implements Comparable<Contestant> {
    private String name;
    private int placement;

    public Contestant(String name) {
        this.name = name;
        this.placement = 0;
    }

    public void setPlacement(int value) {
        this.placement = value;
    }

    @Override
    public String toString() {
        return name + " has finished on place: " + placement;
    }

    @Override
    public int compareTo(Contestant o) {
        if (placement > o.placement) {
            return 1;
        }

        if (placement == o.placement) {
            return 0;
        }

        return -1;
    }
}
