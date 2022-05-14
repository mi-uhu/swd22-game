package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Tile;
import at.compus02.swd.ss2022.game.gameobjects.TileGras;

import java.util.ArrayList;
import java.util.List;

public class GrasTileFactory implements GameObjectFactory {

     private List<GameObject> createAreaOfTiles(float bottomLeftX, float bottomLeftY, float topRightX, float topRightY ) {
        List<GameObject> tiles = new ArrayList<>();
        TileGras tile = null;
        while( bottomLeftX < topRightX ) {

            float currentY = bottomLeftY;

            while( currentY < topRightY ) {
                tile = createTileGras( bottomLeftX, currentY );
                currentY += tile.getHeight();

                tiles.add(tile);
            }
            if(tile != null)
                bottomLeftX += tile.getWidth();
        }

        return tiles;
    }

    @Override
    public GameObject create() {
         return createTileGras();
    }

    private TileGras createTileGras() {
         return new TileGras();
    }

    private TileGras createTileGras(float x, float y) {
         TileGras tile = createTileGras();
         tile.setPosition(x, y);
         return tile;
    }

    @Override
    public GameObject create(float x, float y) {
        return createTileGras(x, y);
    }

    @Override
    public List<GameObject> createInitialObjects() {
        return createAreaOfTiles( -240, -240, 240, 240);
    }
}
