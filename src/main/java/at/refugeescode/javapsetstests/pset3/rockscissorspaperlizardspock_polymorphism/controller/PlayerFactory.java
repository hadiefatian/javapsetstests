package at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.controller;


import at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model.ComputerPlayer;
import at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model.HumanPlayer;
import at.refugeescode.javapsetstests.pset3.rockscissorspaperlizardspock_polymorphism.model.Player;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayerFactory {

    public static List<Player> getTwoPlayers() {
        return Stream.of
                (new HumanPlayer(),
                        new ComputerPlayer())
                .collect(Collectors.toList());
    }
}
