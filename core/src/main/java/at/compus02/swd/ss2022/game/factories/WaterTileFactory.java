package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.gameobjects.TileGras;
import at.compus02.swd.ss2022.game.gameobjects.TileWater;

import java.util.List;

public class WaterTileFactory extends TileFactoryBase {

    @Override
    protected TileBase createTile() {
         return new TileWater();
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return createAreaOfTiles( -240, -240, 0, 240);
    }
}
