package at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model;

import at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.controller.MoveFactory;

import java.util.Collections;
import java.util.List;

public class ComputerPlayer implements Player {


    @Override
    public Move getMove() {
        List<Move> computerMove = new MoveFactory().makeMoves();
        Collections.shuffle(computerMove);
        Move firstMove = computerMove.get(0);
        return firstMove;
    }

    @Override
    public boolean wantsToPlayAgain() {
        return true;
    }
}
