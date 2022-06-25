package at.compus02.swd.ss2022.game.movement;

import at.compus02.swd.ss2022.game.observer.PlayerObserver;

public class MoveEnemyStrategyFasterNearPlayer implements EnemyMovementStrategy, PlayerObserver {
    private float playerX, playerY;
    private MoveEnemyStrategySquare moveEnemyStrategySquare = new MoveEnemyStrategySquare();

    @Override
    public MovementVector getMovement(float enemyX, float enemyY) {
        float distance = Math.abs(enemyX - playerX) + Math.abs(enemyY - playerY);
        MovementVector vector = moveEnemyStrategySquare.getMovement(playerX, playerY);

        if( distance < 200 ) {
            return new MovementVector(vector.getX() * 2, vector.getY() * 2 );
        }

        return vector;
    }

    @Override
    public void playerMoved(float fromX, float fromY, float byX, float byY) {
        playerX = fromX + byX;
        playerY = fromY + byY;
    }

    @Override
    public void playerAttacked(float posX, float posY) {

    }
}
