package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.GarageDoor;

@Configuration(enabled = true, commandType = CommandType.OFF)
public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand() {
        this.garageDoor = new GarageDoor();
    }

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }
}
