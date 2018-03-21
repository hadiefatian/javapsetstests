package at.refugeescode.javapsetstests.pset2.model.move;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Moves {

    private static List<Move> moves = Stream.of(
            new Rock(),
            new Scissors(),
            new Paper(),
            new Lizard(),
            new Spock()
    ).collect(Collectors.toList());

    private Moves() {
    }

    public static List<Move> asList() {
        return new ArrayList<>(moves);
    }


    public static String asString() {
        return moves.stream()
                .map(move -> move.getClass().getSimpleName())
                .collect(Collectors.joining(", "));
    }
}
