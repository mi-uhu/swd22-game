package at.compus02.swd.ss2022.game.observer;

public interface PlayerObserver {
    void playerMoved(float fromX, float fromY, float byX, float byY);
    void playerAttacked(float posX, float posY);
}
