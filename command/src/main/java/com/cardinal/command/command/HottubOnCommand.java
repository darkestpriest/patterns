package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.Hottub;

@Configuration(enabled = true, commandType = CommandType.ON)
public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand() {
        this.hottub = new Hottub();
    }

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }

    public void undo() {
        hottub.off();
    }
}
