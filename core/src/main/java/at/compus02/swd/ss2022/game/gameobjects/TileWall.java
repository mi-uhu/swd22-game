package at.compus02.swd.ss2022.game.gameobjects;

public class TileWall extends TileBase {
    public TileWall(boolean isVertical) {
        super("tile_wall.png", 32,32);
        sprite.rotate90(isVertical);
    }

    @Override
    public int getDrawOrder() {
        return DrawOrder.WALL;
    }
}