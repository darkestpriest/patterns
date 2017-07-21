package com.cardinal.command.command;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import com.cardinal.command.objects.Stereo;

@Configuration(enabled = true, commandType = CommandType.OFF)
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand() {
        this.stereo = new Stereo("CD");
    }
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
