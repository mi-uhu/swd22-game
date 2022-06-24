package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Log;

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

}
