package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.Hottub;

@Configuration(enabled = true, commandType = CommandType.OFF)
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand() {
        this.hottub = new Hottub();
    }

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.cool();
        hottub.off();
    }

    public void undo() {
        hottub.heat();
        hottub.on();
    }
}
