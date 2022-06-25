package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.factories.AssetRepository;
import at.compus02.swd.ss2022.game.movement.EnemyMovementStrategy;
import at.compus02.swd.ss2022.game.movement.MoveEnemyStrategySquare;
import at.compus02.swd.ss2022.game.movement.MovementVector;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class EnemyBase implements GameObject{
    private Texture image;
    private Sprite sprite;
    private EnemyMovementStrategy enemyMovementStrategy;

    public EnemyBase(String enemy, EnemyMovementStrategy enemyMovementStrategy) {
        image = AssetRepository.getInstance().getTexture(enemy);
        sprite = new Sprite(image);
        this.enemyMovementStrategy = enemyMovementStrategy;
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

    public float getPositionX() {
        return sprite.getX();
    }

    public float getPositionY() {
        return sprite.getY();
    }

    public void move () {
        MovementVector movementVector = enemyMovementStrategy.getMovement();
        sprite.translate(movementVector.getX(), movementVector.getY());
    }
}
