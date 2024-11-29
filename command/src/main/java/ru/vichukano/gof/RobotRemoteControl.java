package ru.vichukano.gof;

import ru.vichukano.gof.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Клиент ничего не знает, про внутренности устройств, которыми управляет через команды.
 * Может управлять всем, что поддерживает интерфейс Command
 */
public class RobotRemoteControl {
    private final List<Command> commands = new ArrayList<>();

    public void doCommand(Command command) {
        command.execute();
        commands.add(command);
    }

    public void logCommands() {
        for (var c : commands) {
            System.out.println(c);
        }
    }
}
