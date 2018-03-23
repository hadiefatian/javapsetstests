package at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model;

public class Spock implements Move {
    @Override
    public MoveType getType() {
        return MoveType.SPOCK;
    }

    @Override
    public boolean defeats(Move move) {
        return move.getType().equals(MoveType.SCISSORS) || move.getType().equals(MoveType.ROCK);
    }
}
