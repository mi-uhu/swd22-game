package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.factories.AssetRepository;
import at.compus02.swd.ss2022.game.observer.PlayerObserver;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class Player implements GameObject {
    private Texture image;
    private Sprite sprite;

    private ArrayList<PlayerObserver> playerObservers;

    public Player() {
        image = AssetRepository.getInstance().getTexture("player.png");
        sprite = new Sprite(image, 48, 56, 48, 56);
        playerObservers = new ArrayList<>();
    }

    public void registerObserver(PlayerObserver playerObserver) {
        playerObservers.add(playerObserver);
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
        return DrawOrder.PLAYER;
    }

    public void move(float x, float y) {
        float fromX = sprite.getX();
        float fromY = sprite.getY();

        sprite.translate(x, y);
        for (PlayerObserver playerObserver : playerObservers) {
            playerObserver.playerMoved(fromX, fromY, x, y);
        }
    }

    public void attack() {
        float x = sprite.getX();
        float y = sprite.getY();

        for (PlayerObserver playerObserver : playerObservers) {
            playerObserver.playerAttacked(x, y);
        }
    }
}
