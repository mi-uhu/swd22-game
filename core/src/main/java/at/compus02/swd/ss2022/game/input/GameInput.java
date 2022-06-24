package at.compus02.swd.ss2022.game.input;

import com.badlogic.gdx.InputAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GameInput extends InputAdapter {
    private HashMap<Integer, ArrayList<Command>> moveCommandHashMap;
    private HashMap<Integer, ArrayList<Command>> singleActionCommandHashMap;
    private HashSet<Integer> pressedKeys;

    public GameInput() {
        moveCommandHashMap = new HashMap<>();
        singleActionCommandHashMap = new HashMap<>();
        pressedKeys = new HashSet<>();
    }

    @Override
    public boolean keyDown(int keycode) {
        pressedKeys.add(keycode);

        ArrayList<Command> commandArrayList = singleActionCommandHashMap.get(keycode);
        if (commandArrayList != null) {
            for (Command command : commandArrayList) {
                command.execute();
            }
        }

        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        pressedKeys.remove(keycode);
        return true;
    }

    public void update() {
        for (Integer pressedKey : pressedKeys) {
            ArrayList<Command> commandArrayList = moveCommandHashMap.get(pressedKey);
            if (commandArrayList != null) {
                for (Command command : commandArrayList) {
                    command.execute();
                }
            }
        }
    }

    public void registerMoveCommand(int keycode, Command command) {
        if (moveCommandHashMap.containsKey(keycode)) {
            moveCommandHashMap.get(keycode).add(command);
        } else {
            ArrayList<Command> commandArrayList = new ArrayList<>();
            commandArrayList.add(command);
            moveCommandHashMap.put(keycode, commandArrayList);
        }
    }

    public void registerSingleActionCommand(int keycode, Command command) {
        if (singleActionCommandHashMap.containsKey(keycode)) {
            singleActionCommandHashMap.get(keycode).add(command);
        } else {
            ArrayList<Command> commandArrayList = new ArrayList<>();
            commandArrayList.add(command);
            singleActionCommandHashMap.put(keycode, commandArrayList);
        }
    }
}
