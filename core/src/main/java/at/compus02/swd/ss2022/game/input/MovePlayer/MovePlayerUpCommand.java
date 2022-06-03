package at.compus02.swd.ss2022.game.input.MovePlayer;

import at.compus02.swd.ss2022.game.gameobjects.Player;
import at.compus02.swd.ss2022.game.input.Command;

public class MovePlayerUpCommand implements Command {
    private Player player;

    public MovePlayerUpCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {

    }
}
