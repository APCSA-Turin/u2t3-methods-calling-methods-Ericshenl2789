public class Game {
    private String gameName;
    private int players;
    private int score;
    private boolean scoreDouble;

    public Game(String gamename, int players){
        this.gameName = gamename;
        this.players = players;
        score = 0;
    }

    public void addPlayer(){
        players++;
    }

    public void increaseScore(int increase){
        if (scoreDouble == true ) {
            score += increase * 2;
            scoreDouble = false;
        } else {
            score += increase;
        }
    }

    public void decreaseScore(int decrease){
        if (scoreDouble == true) {
            score -= decrease * 2;
            scoreDouble = false;
        } else {
            score -= decrease;
        }
        if (score < 0 ) {
            score = 0;
        }
    }

    public void scoreDoubler(){ //doubles the gain/loss of the next change in score
        scoreDouble = true;
    }

    public double averageScorePerPlayer(){
        return (double) score / players;
    }

    public boolean isGameOver(){
        return score > 9 ? true : false;
    }

    public String getGameName(){
        return gameName;
    }

    public int getPlayers(){
        return players;
    }

    public int getScore(){
        return score;
    }
}
