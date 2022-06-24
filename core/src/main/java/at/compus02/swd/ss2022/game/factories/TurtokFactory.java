package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Turtok;

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

}
