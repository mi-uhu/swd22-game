package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.EnemyBase;
import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Pikachu;
import at.compus02.swd.ss2022.game.gameobjects.Turtok;
import at.compus02.swd.ss2022.game.movement.EnemyManager;
import at.compus02.swd.ss2022.game.movement.EnemyMovementStrategy;

public class EnemyFactory {

    public EnemyBase createTurtok(float x, float y, EnemyMovementStrategy movementStrategy) {
        EnemyBase turtok = new Turtok(movementStrategy);
        turtok.setPosition(x, y);
        return turtok;
    }

    public EnemyBase createPikachu(float x, float y, EnemyMovementStrategy movementStrategy) {
        EnemyBase pikachu = new Pikachu(movementStrategy);
        pikachu.setPosition(x, y);
        return pikachu;
    }
}
