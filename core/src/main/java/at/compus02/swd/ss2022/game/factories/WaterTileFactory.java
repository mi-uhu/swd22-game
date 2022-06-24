package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.gameobjects.TileWater;

public class WaterTileFactory extends TileFactoryBase {

    @Override
    protected TileBase createTile() {
         return new TileWater();
    }

}
