package ru.vichukano.gof;

import org.junit.jupiter.api.Test;
import ru.vichukano.gof.command.DoWorkCommand;
import ru.vichukano.gof.command.RefuelCommand;
import ru.vichukano.gof.command.TurnOffCommand;
import ru.vichukano.gof.command.TurnOnCommand;

class RobotRemoteControlTest {

    @Test
    void testCommandPatter() {
        var robot = new Robot();
        var remoteControl = new RobotRemoteControl();
        remoteControl.doCommand(new TurnOnCommand(robot));
        remoteControl.doCommand(new DoWorkCommand(robot, "[CLEANING]"));
        remoteControl.doCommand(new RefuelCommand(robot, 10));
        remoteControl.doCommand(new DoWorkCommand(robot, "[REPAIRING]"));
        remoteControl.doCommand(new RefuelCommand(robot, 100));
        remoteControl.doCommand(new TurnOffCommand(robot));
        remoteControl.logCommands();
    }

}