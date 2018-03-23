package at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.controller;

import at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model.Move;
import at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model.Result;

public class Judge {


    public Result getResult(Move moveOne, Move moveTwo) {

        Result result = new Result();
        result.setPlayer1move(moveOne);
        result.setPlayer2move(moveTwo);
        result.setWinner(getTheWinner(moveOne, moveTwo));
        return result;

    }

    private String getTheWinner(Move moveOne, Move moveTwo) {

        if (moveOne.defeats(moveTwo)) {
            return "Player one wins!";
        }

        if (moveTwo.defeats(moveOne)) {
            return "Player two wins!";
        }

        return "Draw";

    }

}
