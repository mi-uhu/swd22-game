package at.compus02.swd.ss2022.game.input;

import at.compus02.swd.ss2022.game.gameobjects.Player;
import at.compus02.swd.ss2022.game.input.Command;

public class MovePlayerCommand implements Command {
    private Player player;
    private float x;
    private float y;

    public MovePlayerCommand(Player player, float x, float y) {
        this.player = player;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        player.translate(x,y);
    }
}
