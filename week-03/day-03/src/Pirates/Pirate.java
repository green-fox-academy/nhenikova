package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Pirate {
    private String name;
    private boolean drunk = false;
    private boolean dead = false;
    List<Parrot> parrots;

    public Pirate(String name) {
        this.name = name;
        this.parrots = new ArrayList<>();
    }

    public void addParrot(Parrot parrot) {
        parrots.add(parrot);
    }

    public Pirate() {

    }

    public void drinkSomeRum() {
        if (dead == true) {
            System.out.println("The pirate is dead, can't drink rum.");
        } else {
            drunk = true;
        }
    }

    public void howItsGoingMate() {
        if (dead == true) {
            System.out.println("The pirate is dead, can't speaking.");
        } else {
            if (drunk == true) {
                for (int i = 0; i < 4; i++) {
                    System.out.println("Pour me annudder!");
                }
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            }
        }
    }

    public void die() {
        dead = true;
        System.out.println(name + " is dead");
    }

    public boolean getDead() {
        return dead;
    }

    public void brawl(Pirate enemyPirate) {
        if (enemyPirate.getDead()) {
            System.out.println("Iam dead, I can't fight.");
        } else {
            int resultOfFight = (int) (Math.random() * 3);
            if (resultOfFight == 0) {
                die();
            } else if (resultOfFight == 1) {
                enemyPirate.die();
            } else {
                die();
                enemyPirate.die();
            }
        }
    }

}

//Pirates
//Create a Pirate class. While you can add other
// fields and methods, you must have these methods:-
//
//drinkSomeRum() - intoxicates the Pirate some
//howsItGoingMate() - when called, the Pirate replies,
// if drinkSomeRun was called:-
//0 to 4 times, "Pour me anudder!"
//else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?",
// the pirate passes out and sleeps it off.
//If you manage to get this far, then you can try to do the following.
//
//die() - this kills off the pirate, in which case,
// drinkSomeRum, etc. just result in he's dead.
//brawl(x) - where pirate fights another pirate
// (if that other pirate is alive) and there's a 1/3 chance,
// 1 dies, the other dies or they both pass out.
//And... if you get that far...
//
//Add a parrot.