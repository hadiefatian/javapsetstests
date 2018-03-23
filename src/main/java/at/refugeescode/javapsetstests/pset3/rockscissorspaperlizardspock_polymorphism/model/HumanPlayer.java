package at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model;

import at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.controller.MoveFactory;

import java.util.List;
import java.util.Scanner;

public class HumanPlayer implements Player {

    Scanner scanner = new Scanner(System.in);

    @Override
    public Move getMove() {
        List<Move> moves = new MoveFactory().makeMoves();
        System.out.print("Write your move (rock, scissors, paper, lizard, spock): ");
        String humanMove = scanner.nextLine();
        return tohumanMove(humanMove, moves);
    }

    private Move tohumanMove(String humanMove, List<Move> moves) {
        return moves.stream()
                .filter(move -> move.getType().toString().equalsIgnoreCase(humanMove))
                .findFirst().get();
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.print("\nDo you want to play again? (y/n): ");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y");
    }
}
