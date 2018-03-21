package at.refugeescode.javapsetstests.pset2.controller;

import oop.opencoding.pset2.model.Result;
import oop.opencoding.pset2.model.move.Move;

public class Judge {

    public Result getResult(Move move1, Move move2) {
        Result result = new Result();
        result.setMove1(move1);
        result.setMove2(move2);
        result.setWinner(getWinner(move1, move2));
        return result;
    }

    private String getWinner(Move move1, Move move2) {
        if (move1.defeats(move2)) {
            return "Player 1 wins";
        }
        if (move2.defeats(move1)) {
            return "Player 2 wins";
        }
        return "Nobody wins";
    }
}
