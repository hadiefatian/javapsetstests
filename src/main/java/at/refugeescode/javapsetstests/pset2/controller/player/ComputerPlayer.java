package at.refugeescode.javapsetstests.pset2.controller.player;

import at.refugeescode.javapsetstests.pset2.model.move.Move;
import at.refugeescode.javapsetstests.pset2.model.move.Moves;

import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {

    private Random random = new Random();

    ComputerPlayer() {
    }

    @Override
    public Move getMove() {
        List<Move> moves = Moves.asList();
        int randomIndex = random.nextInt(moves.size());
        return moves.get(randomIndex);
    }

    @Override
    public boolean wantsToPlayAgain() {
        return true;
    }
}
