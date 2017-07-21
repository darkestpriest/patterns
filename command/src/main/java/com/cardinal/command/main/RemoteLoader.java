package com.cardinal.command.main;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.util.CommandScanner;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class RemoteLoader {

    public static void main(String[] args) {
        Map<CommandType, List<Command>> commandMap = CommandScanner.getAvailableCommands();
        List<Command> offCommands = commandMap.get(CommandType.OFF);
        List<Command> onCommands = commandMap.get(CommandType.ON);
        RemoteControl control = new RemoteControl(commandMap);
        System.out.println(control);

        IntStream.range(0, offCommands.size())
                .forEach(i ->
                        control.offButtonWasPushed(i)
                );
        IntStream.range(0, onCommands.size())
                .forEach(i ->
                        control.onButtonWasPushed(i)
                );
    }
}
