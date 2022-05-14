package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.gameobjects.TileGravel;
import at.compus02.swd.ss2022.game.gameobjects.TileWater;

import java.util.ArrayList;
import java.util.List;

public class GravelTileFactory extends TileFactoryBase {

    @Override
    protected TileBase createTile() {
         return new TileGravel();
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return new ArrayList<>();
    }
}
