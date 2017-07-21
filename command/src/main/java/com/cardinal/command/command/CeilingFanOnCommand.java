package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.CeilingFan;

@Configuration(enabled = true, commandType = CommandType.ON)
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand() {
        this.ceilingFan = new CeilingFan("Living Room");
    }

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        ceilingFan.high();
    }
}
