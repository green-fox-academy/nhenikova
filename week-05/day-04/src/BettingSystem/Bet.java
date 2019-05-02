package BettingSystem;
import java.util.Random;

public class Bet {
    private int betId;
    private int amount;
    private Player player;
    private Contestant contestant;

    public Bet(int amount, Player player, Contestant contestant) {
        this.betId = new Random().nextInt(9000) + 1000;
        this.amount = amount;
        this.player = player;
        this.contestant = contestant;
    }

    public int getBetId() {
        return betId;
    }

    public int getAmount() {
        return amount;
    }

    public Contestant getContestant() {
        return contestant;
    }
}