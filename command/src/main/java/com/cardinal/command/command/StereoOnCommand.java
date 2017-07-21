package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.Stereo;

@Configuration(enabled = true, commandType = CommandType.ON)
public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand() {
        this.stereo = new Stereo("CD");
    }
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
