package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Stone;

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

}
