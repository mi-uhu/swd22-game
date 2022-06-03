package at.compus02.swd.ss2022.game.factories;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

public class AssetRepository
{
    private HashMap<String, Texture> textures;

    private static AssetRepository assetRepository;

    private AssetRepository()
    {
        textures = new HashMap<>();
    }

    public static AssetRepository getInstance()
    {
        if(assetRepository == null) {
            assetRepository = new AssetRepository();
        }

        return assetRepository;
    }

    public Texture getTexture(String path)
    {
        if(!textures.containsKey(path)) {
            Texture texture = new Texture(path);
            textures.put(path, texture);
            return texture;
        }
        else {
            return textures.get(path);
        }
    }

    public void dispose()
    {

        for (Texture value : textures.values())
        {
            value.dispose();
        }



    }




}
