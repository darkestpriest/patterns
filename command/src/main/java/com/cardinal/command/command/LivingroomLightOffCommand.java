package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.Light;

@Configuration(enabled = true, commandType = CommandType.OFF)
public class LivingroomLightOffCommand implements Command {
    Light light;

    public LivingroomLightOffCommand() {
        this.light = new Light("Living room");
    }
    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
