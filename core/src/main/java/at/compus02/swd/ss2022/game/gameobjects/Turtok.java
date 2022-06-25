package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.movement.EnemyMovementStrategy;

public class Turtok extends EnemyBase implements GameObject {

    public Turtok(EnemyMovementStrategy enemyMovementStrategy) {
        super("turtok.png", enemyMovementStrategy);
    }

    @Override
    public int getDrawOrder() {
        return DrawOrder.TURTOK;
    }
}
