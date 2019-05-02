package BettingSystem;

import java.util.ArrayList;
import java.util.List;


public class Player {
    private String name;
    private int account;
    private List<Bet> bets;

    public Player(String name, int account) {
        this.name = name;
        this.account = account;
        this.bets = new ArrayList<>();
    }

    public void makeBet(Contestant contestantBet, int amountBet){
        if (this.account > amountBet){
            bets.add(new Bet(amountBet, this, contestantBet));
            this.account -= amountBet;
        }
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public List<Bet> getBets() {
        return bets;
    }
}