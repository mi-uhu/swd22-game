package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Treasure;

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

}
