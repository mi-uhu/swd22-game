package at.compus02.swd.ss2022.game.factories;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.TileBase;

import java.util.ArrayList;
import java.util.List;

public abstract class TileFactoryBase implements  GameObjectFactory {

    abstract TileBase createTile();
    protected TileBase createTile(float x, float y) {
        TileBase tile = createTile();
        tile.setPosition(x, y);
        return tile;
    }

    protected List<GameObject> createAreaOfTiles(float bottomLeftX, float bottomLeftY, float topRightX, float topRightY ) {
        List<GameObject> tiles = new ArrayList<>();
        TileBase tile = null;
        while( bottomLeftX < topRightX ) {

            float currentY = bottomLeftY;

            while( currentY < topRightY ) {
                tile = createTile( bottomLeftX, currentY );
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
        return createTile();
    }

    @Override
    public GameObject create(float x, float y) {
        return createTile(x, y);
    }
}
