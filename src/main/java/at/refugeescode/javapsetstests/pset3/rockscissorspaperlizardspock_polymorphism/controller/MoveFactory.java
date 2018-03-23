package at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.controller;

import at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveFactory {


    public List<Move> makeMoves() {
        return Stream.of(
                new Rock(),
                new Scissors(),
                new Paper(),
                new Lizard(),
                new Spock())
                .collect(Collectors.toList());
    }

}
