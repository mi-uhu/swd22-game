package at.compus02.swd.ss2022.game.gameobjects;

import java.util.ArrayList;
import java.util.List;

public class TileFactory {

    public TileGras createTileGras( float x, float y ) {
        TileGras tile = new TileGras();
        tile.setPosition( x, y );
        return tile;
    }

    public List<Tile> createStartBackgroundTiles(float bottomLeftX, float bottomLeftY, float topRightX, float topRightY ) {
        List<Tile> tiles = new ArrayList<>();

        while( bottomLeftX < topRightX ) {
            float currentY = bottomLeftY;
            while( currentY < topRightY ) {
                TileGras tile = createTileGras( bottomLeftX, currentY );
                currentY += tile.getHeight();

                tiles.add(tile);
            }
            bottomLeftX += tiles.get(0).getWidth();
        }

        return tiles;
    }

}
