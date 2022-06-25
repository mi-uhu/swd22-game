package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.EnemyBase;
import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Pikachu;
import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.input.GameInput;
import at.compus02.swd.ss2022.game.movement.EnemyManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.Array;

public class MapFactory {
    public void createMap(Array<GameObject> gameObjectList, GameInput gameInput, OrthographicCamera camera, EnemyManager enemyManager) {

        final int colorWater    = 0x009cffff;
        final int colorGras     = 0x097b19ff;
        final int colorGravel   = 0xffffffff;
        final int colorLava     = 0x661b0aff;
        final int colorWall     = 0x464646ff;
        final int colorBush     = 0x0fff26ff;
        final int colorPlayer   = 0x000000ff;
        final int colorTurtok   = 0xed1c24ff;
        final int colorPikachu  = 0xfff200ff;

        TileFactory tileFactory = new TileFactory();
        BushFactory bushFactory = new BushFactory();
        EnemyFactory enemyFactory = new EnemyFactory();
        PlayerFactory playerFactory = new PlayerFactory();

        Pixmap mapImage = new Pixmap( new FileHandle("gamemap.png"));

        int width = mapImage.getWidth();
        int heigt = mapImage.getHeight();
        for (int x = 0; x < mapImage.getWidth(); x += 10) {
            for(int y = 0; y < mapImage.getHeight(); y+= 10) {
                int px = mapImage.getPixel(x,y);

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
                         gameObjectList.add(bushFactory.create( posX * tile.getWidth(), posY * tile.getHeight()));
                        break;
                    case colorTurtok:
                         tile = tileFactory.createGrasTile();
                         gameObjectList.add(enemyFactory.createTurtok(posX * tile.getWidth(), posY * tile.getHeight()));
                         break;
                    case colorPikachu:
                        tile = tileFactory.createGrasTile();
                        EnemyBase pikachu = enemyFactory.createPikachu(posX * tile.getWidth(), posY * tile.getHeight());
                        gameObjectList.add(pikachu);
                        enemyManager.addEnemy(pikachu);
                        break;
                    case colorPlayer:
                         tile = tileFactory.createGrasTile();
                         gameObjectList.add(playerFactory.create( gameInput, camera, enemyManager, posX * tile.getWidth(), posY * tile.getHeight()));
                         camera.position.x = posX * tile.getWidth();
                         camera.position.y = posY * tile.getHeight();
                        break;
                }

                tile.setPosition(posX * tile.getWidth(), posY * tile.getHeight());

                gameObjectList.add(tile);
            }
        }
        mapImage.dispose();
    }
}
