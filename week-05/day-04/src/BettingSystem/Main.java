package BettingSystem;

public class Main {
    public static void main(String[] args) {

        Race myRace = new Race();

        Contestant contestant1 = new Contestant("Peter");
        Contestant contestant2 = new Contestant("Jan");
        Contestant contestant3 = new Contestant("Michael");
        Contestant contestant4 = new Contestant("David");

        myRace.contestants.add(contestant1);
        myRace.contestants.add(contestant2);
        myRace.contestants.add(contestant3);
        myRace.contestants.add(contestant4);

        Player player1 = new Player("Player1", 500);
        player1.makeBet(contestant1, 100);
        player1.makeBet(contestant2, 100);
        player1.makeBet(contestant3, 100);
        player1.makeBet(contestant4, 100);

        Player player2 = new Player("Player2", 1000);
        player2.makeBet(contestant2, 500);

        Player player3 = new Player("Player3", 900);
        player3.makeBet(contestant3, 200);

        myRace.players.add(player1);
        myRace.players.add(player2);
        myRace.players.add(player3);

        myRace.startRace();

        System.out.println(player1.getAccount());
    }
}