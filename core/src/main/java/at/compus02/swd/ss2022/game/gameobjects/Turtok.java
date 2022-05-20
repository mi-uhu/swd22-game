package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Turtok implements GameObject {
    private Texture image;
    private Sprite sprite;

    public Turtok() {
        image = new Texture("turtok.png");
        sprite = new Sprite(image);
        sprite.setScale((float) 0.8);
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

    @Override
    public int getDrawOrder() {
        return DrawOrder.TURTOK;
    }
}
