package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.input.GameInput;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Array;

import java.util.List;

public class MapFactory {
    public void createMap(Array<GameObject> gameObjectList, GameInput gameInput, OrthographicCamera camera) {

        final int colorWater  = 0x009cffff;
        final int colorGras   = 0x097b19ff;
        final int colorGravel = 0xffffffff;
        final int colorLava   = 0x661b0aff;
        final int colorWall   = 0x464646ff;
        final int colorBush   = 0x0fff26ff;
        final int colorPlayer = 0x000000ff;

        WaterTileFactory waterTileFactory = new WaterTileFactory();
        GrasTileFactory grasTileFactory = new GrasTileFactory();
        GravelTileFactory gravelTileFactory = new GravelTileFactory();
        LavaTileFactory lavaTileFactory = new LavaTileFactory();
        WallTileFactory wallTileFactory = new WallTileFactory();
        BushFactory bushFactory = new BushFactory();
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
                        tile = waterTileFactory.createTile();
                        break;
                    case colorGras:
                         tile = grasTileFactory.createTile();
                        break;
                    case colorGravel:
                         tile = gravelTileFactory.createTile();
                        break;
                    case colorLava:
                         tile = lavaTileFactory.createTile();
                        break;
                    case colorWall:
                         tile = wallTileFactory.createTile();
                        break;
                    case colorBush:
                         tile = grasTileFactory.createTile();
                         gameObjectList.add(bushFactory.create( posX * tile.getWidth(), posY * tile.getHeight()));
                        break;
                    case colorPlayer:
                         tile = grasTileFactory.createTile();
                         gameObjectList.add(playerFactory.create( gameInput, posX * tile.getWidth(), posY * tile.getHeight()));
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
