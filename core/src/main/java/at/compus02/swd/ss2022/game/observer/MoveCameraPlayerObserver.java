package at.compus02.swd.ss2022.game.observer;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class MoveCameraPlayerObserver implements PlayerObserver {
    private OrthographicCamera camera;

    public MoveCameraPlayerObserver(OrthographicCamera camera) {
        this.camera = camera;
    }

    @Override
    public void playerMoved(float x, float y) {
        System.out.println("Move camera " + x + "/" + y);
        camera.translate(x, y);
        camera.update();
    }
}
