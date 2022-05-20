package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Pikachu;
import at.compus02.swd.ss2022.game.gameobjects.Player;

import java.util.Collections;
import java.util.List;

public class PikachuFactory implements GameObjectFactory {
    @Override
    public GameObject create() {
        return new Pikachu();
    }

    @Override
    public GameObject create(float x, float y) {
        GameObject pikachu = create();
        pikachu.setPosition(x, y);
        return pikachu;
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return Collections.singletonList(create(0, -60));
    }
}
