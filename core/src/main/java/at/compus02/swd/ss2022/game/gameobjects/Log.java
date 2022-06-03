package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.factories.AssetRepository;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Log implements GameObject {
    private Texture image;
    private Sprite sprite;

    public Log() {
        image = AssetRepository.getInstance().getTexture("log.png");
        sprite = new Sprite(image);
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
        return DrawOrder.LOG;
    }
}
