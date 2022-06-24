package at.compus02.swd.ss2022.game.input;

import at.compus02.swd.ss2022.game.gameobjects.Player;

public class PlayerMoveCommand implements Command {
    private Player player;
    private float x;
    private float y;

    public PlayerMoveCommand(Player player, float x, float y) {
        this.player = player;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        player.move(x,y);
    }
}
