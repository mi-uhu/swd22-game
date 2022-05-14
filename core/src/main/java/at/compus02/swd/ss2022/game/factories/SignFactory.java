package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.Bush;
import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Sign;

import java.util.Collections;
import java.util.List;

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

    @Override
    public List<GameObject> createInitialObjects() {
        return Collections.singletonList(create(50, 50));
    }
}
