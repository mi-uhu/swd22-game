package at.compus02.swd.ss2022.game.observer;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class MoveCameraPlayerObserver implements PlayerObserver {
    private OrthographicCamera camera;

    public MoveCameraPlayerObserver(OrthographicCamera camera) {
        this.camera = camera;
    }

    @Override
    public void playerMoved(float fromX, float fromY, float byX, float byY) {
        camera.translate(byX, byY);
        camera.update();
    }

    @Override
    public void playerAttacked(float posX, float posY) {
        // nothing to do here
    }
}
