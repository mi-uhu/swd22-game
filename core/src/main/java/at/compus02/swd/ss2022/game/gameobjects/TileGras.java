package at.compus02.swd.ss2022.game.gameobjects;

public class TileGras extends TileBase {
    public TileGras() {
        super("tile_gras.png", 32,32);
    }

    @Override
    public int getDrawOrder() {
        return DrawOrder.GRAS;
    }
}
