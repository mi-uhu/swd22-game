package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Sign;

public class SignFactory implements GameObjectFactory {
    @Override
    public GameObject create() {
        return new Sign();
    }

    @Override
    public GameObject create(float x, float y) {
        GameObject sign = create();
        sign.setPosition(x, y);
        return sign;
    }

}
