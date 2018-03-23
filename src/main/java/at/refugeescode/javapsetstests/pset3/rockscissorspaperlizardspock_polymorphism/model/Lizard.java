package at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model;

public class Lizard implements Move {

    @Override
    public MoveType getType() {
        return MoveType.LIZARD;
    }

    @Override
    public boolean defeats(Move move) {
        return move.getType().equals(MoveType.SPOCK) || move.getType().equals(MoveType.PAPER);
    }
}
