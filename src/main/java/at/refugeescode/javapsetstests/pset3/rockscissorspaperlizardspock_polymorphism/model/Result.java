package at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model;

public class Result {

    private Move player1move;
    private Move player2move;
    private String winner;

    public Move getPlayer1move() {
        return player1move;
    }

    public void setPlayer1move(Move player1move) {
        this.player1move = player1move;
    }

    public Move getPlayer2move() {
        return player2move;
    }

    public void setPlayer2move(Move player2move) {
        this.player2move = player2move;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
