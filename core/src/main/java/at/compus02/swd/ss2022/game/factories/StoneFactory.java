package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Stone;
import at.compus02.swd.ss2022.game.gameobjects.Treasure;

import java.util.Collections;
import java.util.List;

public class StoneFactory implements GameObjectFactory {
    @Override
    public GameObject create() {
        return new Stone();
    }

    @Override
    public GameObject create(float x, float y) {
        GameObject stone = create();
        stone.setPosition(x, y);
        return stone;
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return Collections.singletonList(create(100, -100));
    }
}
