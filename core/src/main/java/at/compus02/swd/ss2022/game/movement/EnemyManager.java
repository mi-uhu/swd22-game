package at.compus02.swd.ss2022.game.movement;

import at.compus02.swd.ss2022.game.gameobjects.EnemyBase;

import java.util.ArrayList;

public class EnemyManager {
    ArrayList<EnemyBase> enemyArrayList = new ArrayList<>();

    public void addEnemy(EnemyBase enemy){
        enemyArrayList.add(enemy);
    }

    public void update () {
        for (EnemyBase enemy:enemyArrayList) {
            enemy.move();
        }
    }
}
