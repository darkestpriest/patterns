package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.Light;

@Configuration(enabled = true, commandType = CommandType.ON)
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand() {
        this. light = new Light("Living room");
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
