package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.EnemyBase;
import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Pikachu;
import at.compus02.swd.ss2022.game.gameobjects.Turtok;
import at.compus02.swd.ss2022.game.movement.EnemyManager;

public class EnemyFactory {
    public EnemyBase createTurtok() {
        return new Turtok();
    }

    public EnemyBase createTurtok(float x, float y) {
        EnemyBase turtok = createTurtok();
        turtok.setPosition(x, y);
        return turtok;
    }

    public EnemyBase createPikachu() {
        return new Pikachu();
    }

    public EnemyBase createPikachu(float x, float y) {
        EnemyBase pikachu = createPikachu();
        pikachu.setPosition(x, y);
        return pikachu;
    }
}
