package at.compus02.swd.ss2022.game.gameobjects;

public class TileLava extends TileBase {
    public TileLava() {
        super("tile_lava.png", 32,32);
    }

    @Override
    public int getDrawOrder() {
        return DrawOrder.LAVA;
    }
}
