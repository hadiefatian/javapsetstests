package at.refugeescode.javapsetstests.pset2.model.move;

public class Lizard implements Move {

    Lizard() {
    }

    @Override
    public boolean defeats(Move move) {
        return move.getClass() == Spock.class || move.getClass() == Paper.class;
    }
}
