package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.factories.AssetRepository;
import at.compus02.swd.ss2022.game.movement.MoveEnemyStrategySquare;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Turtok extends EnemyBase implements GameObject {
    private Texture image;
    private Sprite sprite;

    public Turtok() {
        super("turtok.png", new MoveEnemyStrategySquare());
    }

    @Override
    public int getDrawOrder() {
        return DrawOrder.TURTOK;
    }
}
