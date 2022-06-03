package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Array;

import java.util.List;

public class MapFactory {
    public void createMap(Array<GameObject> gameObjectList) {

        final int colorWater  = 0x009cffff;
        final int colorGras   = 0x097b19ff;
        final int colorGravel = 0xffffffff;
        final int colorLava   = 0x661b0aff;
        final int colorWall   = 0x464646ff;
        final int colorBush   = 0x0fff26ff;

        WaterTileFactory waterTileFactory = new WaterTileFactory();
        GrasTileFactory grasTileFactory = new GrasTileFactory();
        GravelTileFactory gravelTileFactory = new GravelTileFactory();
        LavaTileFactory lavaTileFactory = new LavaTileFactory();
        WallTileFactory wallTileFactory = new WallTileFactory();
        BushFactory bushFactory = new BushFactory();

        Pixmap mapImage = new Pixmap( new FileHandle("gamemap.png"));

        for (int x = 0; x < mapImage.getWidth(); x++) {
            for(int y = 0; y < mapImage.getHeight(); y++) {
                int px = mapImage.getPixel(x,y);

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
                         gameObjectList.add(bushFactory.create( x * tile.getWidth(), y * tile.getHeight()));
                        break;
                }

                tile.setPosition(x * tile.getWidth(), y * tile.getHeight());

                gameObjectList.add(tile);
            }
        }
        mapImage.dispose();
    }
}
