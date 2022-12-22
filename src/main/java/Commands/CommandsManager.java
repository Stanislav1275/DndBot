package Commands;

import org.example.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandsManager {
    private final List<Command> commands;
    public CommandsManager(){
        commands = new ArrayList<>();
        commands.addAll(List.of(new D4(), new D6(), new D8(), new D10(), new D12(), new D20(), new D100()));//добавление команды в лист
    }

    public List<Command> getCommands() {
        return new ArrayList<>(commands);
    }
}
