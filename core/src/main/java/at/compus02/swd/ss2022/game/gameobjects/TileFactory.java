package at.compus02.swd.ss2022.game.gameobjects;

import java.util.ArrayList;
import java.util.List;

public class TileFactory {

    public TileGras createTileGras( float x, float y ) {
        TileGras tile = new TileGras();
        tile.setPosition( x, y );
        return tile;
    }

    public List<TileGras> createStartBackgroundTiles(float topLeftX, float topLeftY,
                                                     float bottomRightX, float bottomRightY ) {
        List<TileGras> tiles = new ArrayList<>();

        while( topLeftX <= bottomRightX ) {
            float currentY = topLeftY;
            while( currentY >= bottomRightY ) {
                TileGras tile = new TileGras();
                tile.setPosition( topLeftX, currentY );
                currentY -= tile.getHeight();

                tiles.add(tile);
            }
            topLeftX += tiles.get(0).getWidth();
        }

        return tiles;
    }

}
