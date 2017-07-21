package com.cardinal.command.command;

import com.cardinal.command.interfaces.Command;

public class NoCommand implements Command {
    public void execute() { }

    @Override
    public void undo() {
    }
}
