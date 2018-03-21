package at.refugeescode.javapsetstests.pset2.model.move;

public class Paper implements Move {

    Paper() {
    }

    @Override
    public boolean defeats(Move move) {
        return move.getClass() == Rock.class || move.getClass() == Spock.class;
    }
}
