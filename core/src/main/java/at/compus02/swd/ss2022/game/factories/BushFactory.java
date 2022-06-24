package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.Bush;
import at.compus02.swd.ss2022.game.gameobjects.GameObject;

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

}
