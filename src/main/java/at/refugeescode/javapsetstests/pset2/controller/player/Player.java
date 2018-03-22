package at.refugeescode.javapsetstests.pset2.controller.player;

import at.refugeescode.javapsetstests.pset2.model.move.Move;

public interface Player {

    Move getMove();

    boolean wantsToPlayAgain();

}
