package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.*;

public class TileFactory
{

    public TileBase createWaterTile() {
        return new TileWater();
    }

    public TileBase createGrasTile() {
        return new TileGras();
    }

    public TileBase createGravelTile() {
        return new TileGravel();
    }

    public TileBase createLavaTile() {
        return new TileLava();
    }

    public TileBase createWallTile() { return new TileWall(true); }





}
