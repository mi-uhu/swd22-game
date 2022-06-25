package at.compus02.swd.ss2022.game.movement;

public class MoveEnemyStrategySquare implements EnemyMovementStrategy {

    private int count = 0;
    private float x,y;

    public MoveEnemyStrategySquare() {
        this.x = 2;
        this.y = 2;
    }

    @Override
    public MovementVector getMovement() {
        count++;
        if (count <= 50) {
            if (count == 50)
              x *= -1;

            return new MovementVector(x,0);
        }
        else {
            if (count == 100) {
                y *= -1;
                count = 0;
            }
            return new MovementVector(0, y);
        }
    }
}
