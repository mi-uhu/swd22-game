package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;

import java.util.List;

public interface GameObjectFactory {
    GameObject create();
    GameObject create(float x, float y);
}
