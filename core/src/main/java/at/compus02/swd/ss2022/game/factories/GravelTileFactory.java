package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.gameobjects.TileGravel;

public class GravelTileFactory extends TileFactoryBase {

    @Override
    protected TileBase createTile() {
         return new TileGravel();
    }

}
