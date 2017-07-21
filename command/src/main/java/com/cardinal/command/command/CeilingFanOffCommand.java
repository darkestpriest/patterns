package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.CeilingFan;

@Configuration(enabled = true, commandType = CommandType.OFF)
public class CeilingFanOffCommand implements Command{

    CeilingFan ceilingFan;

    public CeilingFanOffCommand() {
        this.ceilingFan = new CeilingFan("Living Room");
    }
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        ceilingFan.off();
    }

    public void undo() {
        ceilingFan.medium();
    }
}
