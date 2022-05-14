package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class TileBase implements GameObject {
    private Texture image;
    protected Sprite sprite;
    private float width;
    private float height;

    public TileBase(String tile, float width, float height) {
        image = new Texture(tile);
        sprite = new Sprite(image);
        this.width = width;
        this.height = height;
    }

    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

    public float getWidth() {
        return width;
    }
    public float getHeight(){
        return height;
    }
}
