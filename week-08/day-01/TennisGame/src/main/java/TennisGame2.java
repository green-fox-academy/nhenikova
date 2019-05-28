
public class TennisGame2 implements TennisGame {
    private int player1Score;
    private int player2Score;
    private String player1Result;
    private String player2Result;
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Score = 0;
        this.player2Score = 0;
        this.player1Result = "";
        this.player2Result = "";
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public String getScore(){
        String scoreToReturn = "";
        if (player1Score == player2Score && player1Score < 4) {
            if (player1Score == 0) {
                scoreToReturn = "Love";
            } else if (player1Score == 1) {
                scoreToReturn = "Fifteen";
            } else if (player1Score == 2) {
                scoreToReturn = "Thirty";
            } else if (player1Score == 3) {
                scoreToReturn = "Forty";
                scoreToReturn += "-All";
            }
        } else if (player1Score == player2Score && player1Score > 3) {
            scoreToReturn = "Deuce";
        } else if (player1Score > 0 && player2Score == 0) {
            if (player1Score == 1) {
                scoreToReturn = "Fifteen";
            } else if (player1Score == 2) {
                scoreToReturn = "Thirty";
            } else if (player1Score == 3) {
                scoreToReturn = "Forty";
            }
            scoreToReturn = "- Love";
        } else if (player2Score > 0 && player1Score ==0) {
            if (player2Score == 1) {
                scoreToReturn = "Fifteen";
            } else if (player2Score == 2) {
                scoreToReturn = "Thirty";
            } else if (player2Score == 3) {
                scoreToReturn = "Forty";
            }
            scoreToReturn = "Love -" + scoreToReturn;
        } else if (player1Score > player2Score && player1Score < 4) {
            if (player1Score == 2) {
                player1Result = "Thirty";
            } else if (player1Score == 3) {
                player1Result = "Forty";
            } else if (player2Score == 1) {
                player2Result = "Fifteen";
            } else if (player2Score == 2) {
                player2Result = "Thirty";
            }
            scoreToReturn = player1Result + "-" + player2Result;
        } else if (player2Score > player1Score && player2Score < 4) {
            if (player2Score == 2) {
                player2Result = "Thirty";
            } else if (player2Score == 3) {
                player2Result = "Forty";
            } else if (player1Score == 1) {
                player1Result = "Fifteen";
            } else if (player1Score == 2) {
                player1Result = "Thirty";
            }
            scoreToReturn = player1Result + "-" + player2Result;
        } else if (player1Score > player2Score && player2Score >= 3) {
            scoreToReturn = "Advantage player1";
        } else if (player2Score > player1Score && player1Score >= 3) {
            scoreToReturn = "Advantage player2";
        } else if (player1Score >=4 && player2Score >=0 && (player1Score - player2Score)>=2) {
            scoreToReturn = "Win for player1";
        } else if (player2Score >=4 && player1Score >=0 && (player2Score - player1Score)>=2) {
            scoreToReturn = "Win for player2";
        }
        return scoreToReturn;
    }

    public void setPlayer1Score(int times){

        for (int i = 0; i < times; i++)
        {
            increasePlayer1ScoreByOne();
        }
    }

    public void setPlayer2Score(int times){

        for (int i = 0; i < times; i++)
        {
            increasePlayer2ScoreByOne();
        }
    }

    public void increasePlayer1ScoreByOne(){
        player1Score++;
    }

    public void increasePlayer2ScoreByOne(){
        player2Score++;
    }

    public void wonPoint(String player) {
        if (player == "player1") {
            increasePlayer1ScoreByOne();
        } else {
            increasePlayer2ScoreByOne();
        }
    }
}