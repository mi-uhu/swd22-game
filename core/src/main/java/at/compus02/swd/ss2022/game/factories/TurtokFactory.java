package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Pikachu;
import at.compus02.swd.ss2022.game.gameobjects.Turtok;

import java.util.Collections;
import java.util.List;

public class TurtokFactory implements GameObjectFactory {
    @Override
    public GameObject create() {
        return new Turtok();
    }

    @Override
    public GameObject create(float x, float y) {
        GameObject turtok = create();
        turtok.setPosition(x, y);
        return turtok;
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return Collections.singletonList(create(-220, 170));
    }
}
