package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.factories.AssetRepository;
import at.compus02.swd.ss2022.game.movement.EnemyMovementStrategy;
import at.compus02.swd.ss2022.game.movement.MoveEnemyStrategySquare;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Pikachu extends EnemyBase implements GameObject {

    public Pikachu(EnemyMovementStrategy enemyMovementStrategy) {
        super("pikachu.png", enemyMovementStrategy);
    }

    @Override
    public int getDrawOrder() {
        return DrawOrder.PIKACHU;
    }
}
