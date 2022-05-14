package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayerFactory implements GameObjectFactory {
    @Override
    public GameObject create() {
        return new Player();
    }

    @Override
    public GameObject create(float x, float y) {
        GameObject player = create();
        player.setPosition(x, y);
        return player;
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return Collections.singletonList(create(0, 0));
    }
}
