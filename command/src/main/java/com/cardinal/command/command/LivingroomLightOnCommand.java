package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.Light;

@Configuration(enabled = true, commandType = CommandType.ON)
public class LivingroomLightOnCommand implements Command {
    Light light;

    public LivingroomLightOnCommand() {
        this.light = new Light("Living room");
    }

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
