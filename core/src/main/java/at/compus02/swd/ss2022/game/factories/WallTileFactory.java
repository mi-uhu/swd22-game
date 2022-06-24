package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.gameobjects.TileWall;

public class WallTileFactory extends TileFactoryBase{
    @Override
    TileBase createTile() {return new TileWall(true);}
}
