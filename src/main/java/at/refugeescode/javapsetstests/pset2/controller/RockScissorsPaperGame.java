package at.refugeescode.javapsetstests.pset2.controller;

import oop.opencoding.pset2.controller.player.HumanPlayer;
import oop.opencoding.pset2.controller.player.Player;
import oop.opencoding.pset2.controller.player.Players;
import oop.opencoding.pset2.model.move.Move;
import oop.opencoding.pset2.model.Result;
import oop.opencoding.pset2.view.Host;

import java.util.List;

public class RockScissorsPaperGame {

    private Host host = new Host();
    private Judge judge = new Judge();

    public void play() {
        // get players

        // as long as players want to play
        // play one round
        // ask them if they want to play again


        host.welcome();
        List<Player> players = Players.getTwoPlayers();
        Player player1 = players.get(0);
        Player player2 = players.get(1);

        boolean wantToPlayAgain = true;
        while (wantToPlayAgain) {
            playOneRound(player1, player2);
            wantToPlayAgain = ask(player1, player2);
        }

        host.goodbye();
    }

    private void playOneRound(Player player1, Player player2) {
        Move move1 = player1.getMove();
        Move move2 = player2.getMove();
        Result result = judge.getResult(move1, move2);
        host.display(result);
    }

    private boolean ask(Player player1, Player player2) {
        return player1.wantsToPlayAgain() && player2.wantsToPlayAgain();
    }
}
