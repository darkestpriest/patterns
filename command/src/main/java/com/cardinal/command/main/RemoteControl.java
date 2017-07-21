package com.cardinal.command.main;

import com.cardinal.command.command.NoCommand;
import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;

import java.util.List;
import java.util.Map;

public class RemoteControl {

    private final List<Command> onCommands;
    private final List<Command> offCommands;

    private Command undoCommand;

    public RemoteControl(final Map<CommandType, List<Command>> commandMap) {
        onCommands = commandMap.get(CommandType.ON);
        offCommands = commandMap.get(CommandType.OFF);
        undoCommand = new NoCommand();
    }

    public void onButtonWasPushed(int slot) {
        onCommands.get(slot).execute();
        this.undoCommand = onCommands.get(slot);
    }
    public void offButtonWasPushed(int slot) {
        offCommands.get(slot).execute();
        this.undoCommand = offCommands.get(slot);
    }

    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        offCommands.forEach(command -> stringBuff.append(CommandType.OFF + "-" + command + "\n"));
        onCommands.forEach(command -> stringBuff.append(CommandType.ON + "-" + command + "\n"));
        return stringBuff.toString();
    }
}
