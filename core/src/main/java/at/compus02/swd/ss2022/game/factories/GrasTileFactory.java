package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.gameobjects.TileGras;

public class GrasTileFactory extends TileFactoryBase {

    @Override
    protected TileBase createTile() {
         return new TileGras();
    }

}
