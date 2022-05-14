package at.compus02.swd.ss2022.game.gameobjects;

public class TileGravel extends TileBase {
    public TileGravel() {
        super("tile_gravel.png", 32,32);
    }

    @Override
    public int getDrawOrder() {
        return DrawOrder.GRAVEL;
    }
}