package at.compus02.swd.ss2022.game.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class GameInput extends InputAdapter {
    private HashMap<Integer, ArrayList<Command>> commandHashMap;

    public GameInput() {
        commandHashMap = new HashMap<>();
    }

    @Override
    public boolean keyDown(int keycode) {
        ArrayList<Command> commandArrayList = commandHashMap.get(keycode);
        for (Command command: commandArrayList) {
            command.execute();
        }
        System.out.println(keycode);
        return true;
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
