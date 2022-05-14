package at.compus02.swd.ss2022.game;

import at.compus02.swd.ss2022.game.factories.*;
import at.compus02.swd.ss2022.game.gameobjects.*;
import at.compus02.swd.ss2022.game.input.GameInput;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import java.util.Arrays;
import java.util.List;

/**
 * {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms.
 */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;

    private ExtendViewport viewport = new ExtendViewport(480.0f, 480.0f, 480.0f, 480.0f);
    private GameInput gameInput = new GameInput();

    private Array<GameObject> gameObjects = new Array<>();

    private final float updatesPerSecond = 60;
    private final float logicFrameTime = 1 / updatesPerSecond;
    private float deltaAccumulator = 0;

    @Override
    public void create() {
        batch = new SpriteBatch();

        List<GameObjectFactory> factories = Arrays.asList(
                new GrasTileFactory(),
                new LavaTileFactory(),
                new WaterTileFactory(),
                new WallTileFactory(),
                new PlayerFactory(),
                new TreasureFactory());


        for(GameObjectFactory factory : factories) {
            List<GameObject> objects = factory.createInitialObjects();
            for (GameObject obj : objects ) {
                gameObjects.add( obj );
            }
        }
    }

    private void act(float delta) {
        for (GameObject gameObject : gameObjects) {
            gameObject.act(delta);
        }
    }

    private void draw() {
        batch.setProjectionMatrix(viewport.getCamera().combined);
        batch.begin();
        for (GameObject gameObject : gameObjects) {
            gameObject.draw(batch);
        }
        batch.end();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        float delta = Gdx.graphics.getDeltaTime();
        deltaAccumulator += delta;
        while (deltaAccumulator > logicFrameTime) {
            deltaAccumulator -= logicFrameTime;
            act(logicFrameTime);
        }
        draw();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }
}