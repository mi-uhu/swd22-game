package at.compus02.swd.ss2022.game.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GameInput extends InputAdapter {
    private HashMap<Integer, ArrayList<Command>> commandHashMap;
    private HashSet<Integer> pressedKeys;

    public GameInput() {
        commandHashMap = new HashMap<>();
        pressedKeys = new HashSet<>();
    }

    @Override
    public boolean keyDown(int keycode) {
        pressedKeys.add(keycode);
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        pressedKeys.remove(keycode);
        return true;
    }

    public void update() {
        for (Integer pressedKey:pressedKeys) {
            ArrayList<Command> commandArrayList = commandHashMap.get(pressedKey);
            if (commandArrayList != null) {
                for (Command command : commandArrayList) {
                    command.execute();
                }
            } else {
                System.out.println("Key not found");
            }
            System.out.println(pressedKey);
        }
    }
    public void registerCommand (int keycode, Command command) {
        if (commandHashMap.containsKey(keycode)) {
            commandHashMap.get(keycode).add(command);
        } else {
            ArrayList<Command> commandArrayList = new ArrayList<Command>();
            commandArrayList.add(command);
            commandHashMap.put(keycode, commandArrayList);
        }
    }
}
