package at.refugeescode.javapsetstests.pset2.controller.player;

import java.util.Arrays;
import java.util.List;

public class Players {

    private Players() {
    }

    public static List<Player> getTwoPlayers() {
        return Arrays.asList(new HumanPlayer(), new ComputerPlayer());
    }
}
