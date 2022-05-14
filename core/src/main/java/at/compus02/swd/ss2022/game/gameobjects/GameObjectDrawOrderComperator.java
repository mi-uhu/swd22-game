package at.compus02.swd.ss2022.game.gameobjects;

import java.util.Comparator;

public class GameObjectDrawOrderComperator implements Comparator<GameObject> {

    @Override
    public int compare(GameObject o1, GameObject o2) {
        return Integer.compare(o1.getDrawOrder(), o2.getDrawOrder());
    }
}
