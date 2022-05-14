package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.gameobjects.TileGras;
import at.compus02.swd.ss2022.game.gameobjects.TileLava;

import java.util.ArrayList;
import java.util.List;

public class LavaTileFactory extends TileFactoryBase {

    @Override
    protected TileBase createTile() {
        return new TileLava();
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return createAreaOfTiles( 0, -240, 240, 240);
    }
}
