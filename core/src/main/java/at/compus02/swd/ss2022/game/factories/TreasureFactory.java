package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Player;
import at.compus02.swd.ss2022.game.gameobjects.Treasure;

import java.util.Collections;
import java.util.List;

public class TreasureFactory implements GameObjectFactory {
    @Override
    public GameObject create() {
        return new Treasure();
    }

    @Override
    public GameObject create(float x, float y) {
        GameObject treasure = create();
        treasure.setPosition(x, y);
        return treasure;
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return Collections.singletonList(create(100, 100));
    }
}
