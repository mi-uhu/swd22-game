package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Glurak;
import at.compus02.swd.ss2022.game.gameobjects.Pikachu;

import java.util.Collections;
import java.util.List;

public class GlurakFactory implements GameObjectFactory {
    @Override
    public GameObject create() {
        return new Glurak();
    }

    @Override
    public GameObject create(float x, float y) {
        GameObject glurak = create();
        glurak.setPosition(x, y);
        return glurak;
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return Collections.singletonList(create(150, -150));
    }
}
