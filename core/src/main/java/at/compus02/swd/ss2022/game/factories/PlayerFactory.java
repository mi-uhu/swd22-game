package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Player;
import at.compus02.swd.ss2022.game.input.GameInput;
import at.compus02.swd.ss2022.game.input.MovePlayerCommand;
import at.compus02.swd.ss2022.game.observer.MoveCameraPlayerObserver;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class PlayerFactory {

    public GameObject create(GameInput gameInput, OrthographicCamera camera) {

        Player player = new Player();

        gameInput.registerCommand(Input.Keys.UP, new MovePlayerCommand(player, 0, 2));
        gameInput.registerCommand(Input.Keys.DOWN, new MovePlayerCommand(player, 0, -2));
        gameInput.registerCommand(Input.Keys.LEFT, new MovePlayerCommand(player, -2, 0));
        gameInput.registerCommand(Input.Keys.RIGHT, new MovePlayerCommand(player, 2, 0));

        player.registerObserver( new MoveCameraPlayerObserver(camera));

        return player;
    }

    public GameObject create(GameInput gameInput, OrthographicCamera camera, float x, float y) {
        GameObject player = create(gameInput, camera);
        player.setPosition(x, y);
        return player;
    }
}
