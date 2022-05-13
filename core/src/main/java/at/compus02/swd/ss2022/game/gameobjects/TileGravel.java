package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TileGravel implements GameObject {
    private Tile tileGravel;
    private final float WIDTH = 32;
    private final float HEIGHT = 32;

    public TileGravel() {
        tileGravel = new Tile("tile_gravel.png", WIDTH, HEIGHT);
    }

    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        tileGravel.setPosition(x, y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        tileGravel.draw(batch);
    }

    public float getWidth() { return WIDTH; }

    public float getHeight() { return HEIGHT; }
}
