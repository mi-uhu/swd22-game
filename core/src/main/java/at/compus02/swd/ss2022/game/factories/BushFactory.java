package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.Bush;
import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Treasure;

import java.util.Collections;
import java.util.List;

public class BushFactory implements GameObjectFactory {
    @Override
    public GameObject create() {
        return new Bush();
    }

    @Override
    public GameObject create(float x, float y) {
        GameObject bush = create();
        bush.setPosition(x, y);
        return bush;
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return Collections.singletonList(create(150, 150));
    }
}
