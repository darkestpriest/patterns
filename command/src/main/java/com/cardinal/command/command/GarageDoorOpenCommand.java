package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.GarageDoor;

@Configuration(enabled = true, commandType = CommandType.ON)
public class GarageDoorOpenCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorOpenCommand() {
        this.garageDoor = new GarageDoor();
    }

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.up();
    }

    public void undo() {
        this.garageDoor.down();
    }
}
