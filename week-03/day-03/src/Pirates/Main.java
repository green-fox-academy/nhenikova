package Pirates;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pirate pirateCaptainBob = new Pirate("captain Bob");
        Pirate pirateJack = new Pirate("Jack");
        Parrot parrotPal = new Parrot("Pal");
        Pirate pirateSilencio = new Pirate ("Silencio");
        Pirate pirateCaptainJohn = new Pirate("captain John");
        Ship pirateShip = new Ship("Black Pearl");
        Ship enemyShip = new Ship("Death");



        pirateCaptainBob.drinkSomeRum();
        pirateCaptainBob.howItsGoingMate();
        pirateCaptainBob.brawl(pirateJack);
        pirateCaptainBob.howItsGoingMate();
        pirateCaptainBob.addParrot(parrotPal);
        pirateShip.fillShip(pirateCaptainBob);
        pirateShip.fillShip(pirateJack);
        enemyShip.fillShip(pirateSilencio);
        enemyShip.fillShip(pirateCaptainJohn);

    }
}

