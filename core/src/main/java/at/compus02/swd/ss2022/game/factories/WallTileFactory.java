package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.gameobjects.TileWall;

import java.util.ArrayList;
import java.util.List;

public class WallTileFactory extends TileFactoryBase{
    @Override
    TileBase createTile() {return new TileWall(true);}
    @Override
    public List<GameObject> createInitialObjects() {
        return createAreaOfTiles(0, -240, 1, 240);
    }
}
