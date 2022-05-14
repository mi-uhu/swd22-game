package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.Bush;
import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Log;

import java.util.Collections;
import java.util.List;

public class LogFactory implements GameObjectFactory {
    @Override
    public GameObject create() {
        return new Log();
    }

    @Override
    public GameObject create(float x, float y) {
        GameObject log = create();
        log.setPosition(x, y);
        return log;
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return Collections.singletonList(create(70, 20));
    }
}
