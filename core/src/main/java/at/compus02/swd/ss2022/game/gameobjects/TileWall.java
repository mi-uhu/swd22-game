package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TileWall implements GameObject {
    private Tile tileWall;
    private final float WIDTH = 32;
    private final float HEIGHT = 32;

    public TileWall() {
        tileWall = new Tile("tile_wall.png", WIDTH, HEIGHT);
    }

    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        tileWall.setPosition(x, y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        tileWall.draw(batch);
    }

    public float getWidth() { return WIDTH; }

    public float getHeight() { return HEIGHT; }
}
