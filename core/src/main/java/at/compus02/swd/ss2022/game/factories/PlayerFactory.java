package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Player;
import at.compus02.swd.ss2022.game.input.GameInput;
import at.compus02.swd.ss2022.game.input.MovePlayer.MovePlayerDownCommand;
import at.compus02.swd.ss2022.game.input.MovePlayer.MovePlayerLeftCommand;
import at.compus02.swd.ss2022.game.input.MovePlayer.MovePlayerRightCommand;
import at.compus02.swd.ss2022.game.input.MovePlayer.MovePlayerUpCommand;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayerFactory {

    public GameObject create(GameInput gameInput) {

        Player player = new Player();

        gameInput.registerCommand(Input.Keys.UP, new MovePlayerUpCommand(player));
        gameInput.registerCommand(Input.Keys.DOWN, new MovePlayerDownCommand(player));
        gameInput.registerCommand(Input.Keys.LEFT, new MovePlayerLeftCommand(player));
        gameInput.registerCommand(Input.Keys.RIGHT, new MovePlayerRightCommand(player));
        return player;
    }

    public GameObject create(GameInput gameInput, float x, float y) {
        GameObject player = create(gameInput);
        player.setPosition(x, y);
        return player;
    }
}
