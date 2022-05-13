package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TileGras implements GameObject {
    private Tile tileGras;
    private final float WIDTH = 32;
    private final float HEIGHT = 32;

    public TileGras() {
        tileGras = new Tile("tile_gras.png", WIDTH, HEIGHT);
    }

    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        tileGras.setPosition(x, y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        tileGras.draw(batch);
    }

    public float getWidth() { return WIDTH; }

    public float getHeight() { return HEIGHT; }
}
