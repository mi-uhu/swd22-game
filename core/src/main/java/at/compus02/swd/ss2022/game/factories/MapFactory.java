package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.*;
import at.compus02.swd.ss2022.game.input.GameInput;
import at.compus02.swd.ss2022.game.movement.EnemyManager;
import at.compus02.swd.ss2022.game.movement.MoveEnemyStrategySquare;
import at.compus02.swd.ss2022.game.movement.MoveEnemyStrategyFasterNearPlayer;
import at.compus02.swd.ss2022.game.observer.PlayerObserver;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.Array;

import java.util.ArrayList;
import java.util.List;

public class MapFactory {
    public void createMap(Array<GameObject> gameObjectList, GameInput gameInput, OrthographicCamera camera, EnemyManager enemyManager) {

        final int colorWater = 0x009cffff;
        final int colorGras = 0x097b19ff;
        final int colorGravel = 0xffffffff;
        final int colorLava = 0x661b0aff;
        final int colorWall = 0x464646ff;
        final int colorBush = 0x0fff26ff;
        final int colorPlayer = 0x000000ff;
        final int colorTurtok = 0xed1c24ff;
        final int colorPikachu = 0xfff200ff;

        TileFactory tileFactory = new TileFactory();
        BushFactory bushFactory = new BushFactory();
        EnemyFactory enemyFactory = new EnemyFactory();
        PlayerFactory playerFactory = new PlayerFactory();

        List<PlayerObserver> playerObserverList = new ArrayList<>();
        Player player = null;

        Pixmap mapImage = new Pixmap(new FileHandle("gamemap.png"));

        int width = mapImage.getWidth();
        int heigt = mapImage.getHeight();
        for (int x = 0; x < mapImage.getWidth(); x += 10) {
            for (int y = 0; y < mapImage.getHeight(); y += 10) {
                int px = mapImage.getPixel(x, y);

                int posX = x / 10;
                int posY = y / 10;

                TileBase tile;

                switch (px) {
                    default:
                    case colorWater:
                        tile = tileFactory.createWaterTile();
                        break;
                    case colorGras:
                        tile = tileFactory.createGrasTile();
                        break;
                    case colorGravel:
                        tile = tileFactory.createGravelTile();
                        break;
                    case colorLava:
                        tile = tileFactory.createLavaTile();
                        break;
                    case colorWall:
                        tile = tileFactory.createWallTile();
                        break;
                    case colorBush:
                        tile = tileFactory.createGrasTile();
                        gameObjectList.add(bushFactory.create(posX * tile.getWidth(), posY * tile.getHeight()));
                        break;
                    case colorTurtok:
                        tile = tileFactory.createGrasTile();
                        MoveEnemyStrategyFasterNearPlayer moveEnemyStrategyFasterNearPlayer = new MoveEnemyStrategyFasterNearPlayer();
                        EnemyBase turtok = enemyFactory.createTurtok(posX * tile.getWidth(), posY * tile.getHeight(), moveEnemyStrategyFasterNearPlayer);
                        playerObserverList.add(moveEnemyStrategyFasterNearPlayer);
                        gameObjectList.add(turtok);
                        enemyManager.addEnemy(turtok);
                        break;
                    case colorPikachu:
                        tile = tileFactory.createGrasTile();
                        EnemyBase pikachu = enemyFactory.createPikachu(posX * tile.getWidth(), posY * tile.getHeight(), new MoveEnemyStrategySquare());
                        gameObjectList.add(pikachu);
                        enemyManager.addEnemy(pikachu);
                        break;
                    case colorPlayer:
                        tile = tileFactory.createGrasTile();
                        player = playerFactory.create(gameInput, camera, posX * tile.getWidth(), posY * tile.getHeight());
                        gameObjectList.add(player);
                        camera.position.x = posX * tile.getWidth();
                        camera.position.y = posY * tile.getHeight();
                        break;
                }


                tile.setPosition(posX * tile.getWidth(), posY * tile.getHeight());

                gameObjectList.add(tile);
            }
        }
        player.registerObserver(enemyManager);

        for (PlayerObserver playerObserver : playerObserverList) {
            player.registerObserver(playerObserver);
        }
        mapImage.dispose();
    }
}
