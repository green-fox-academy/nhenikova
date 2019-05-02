package BettingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {
    List<Contestant> contestants;
    List<Player> players;

    public Race() {
        this.contestants = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public void startRace() {

        List<Integer> positionsInRace = new ArrayList<>();

        for (int i = 0; i < contestants.size(); i++) {
            positionsInRace.add(i + 1);
        }
        Collections.shuffle(positionsInRace);

        for (int i = 0; i < contestants.size(); i++) {
            contestants.get(i).setPlacement(positionsInRace.get(i));
        }

        Collections.sort(contestants);

        for (Contestant inspectedcontestant : contestants) {
            System.out.println(inspectedcontestant.toString());
        }

        for (Player inspectedPlayer : players) {
            for (Bet inspectedBets : inspectedPlayer.getBets()) {
                if (inspectedBets.getContestant() == contestants.get(0)) {
                    int wonMoney = 2 * inspectedBets.getAmount();
                    inspectedPlayer.setAccount(inspectedBets.getAmount() + wonMoney);
                    System.out.println(inspectedPlayer.getName() + " has won " + wonMoney + " with the bet: " + inspectedBets.getBetId());
                }
            }
        }

    }
}