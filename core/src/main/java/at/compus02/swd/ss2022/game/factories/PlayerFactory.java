package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Player;
import at.compus02.swd.ss2022.game.input.GameInput;
import at.compus02.swd.ss2022.game.input.PlayerAttackCommand;
import at.compus02.swd.ss2022.game.input.PlayerMoveCommand;
import at.compus02.swd.ss2022.game.observer.ConsoleLoggerPlayerObserver;
import at.compus02.swd.ss2022.game.observer.MoveCameraPlayerObserver;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class PlayerFactory {

    public GameObject create(GameInput gameInput, OrthographicCamera camera) {

        Player player = new Player();

        gameInput.registerMoveCommand(Input.Keys.UP, new PlayerMoveCommand(player, 0, 2));
        gameInput.registerMoveCommand(Input.Keys.DOWN, new PlayerMoveCommand(player, 0, -2));
        gameInput.registerMoveCommand(Input.Keys.LEFT, new PlayerMoveCommand(player, -2, 0));
        gameInput.registerMoveCommand(Input.Keys.RIGHT, new PlayerMoveCommand(player, 2, 0));
        gameInput.registerSingleActionCommand(Input.Keys.SPACE, new PlayerAttackCommand(player));

        player.registerObserver(new MoveCameraPlayerObserver(camera));
        player.registerObserver(new ConsoleLoggerPlayerObserver());

        return player;
    }

    public GameObject create(GameInput gameInput, OrthographicCamera camera, float x, float y) {
        GameObject player = create(gameInput, camera);
        player.setPosition(x, y);
        return player;
    }
}
