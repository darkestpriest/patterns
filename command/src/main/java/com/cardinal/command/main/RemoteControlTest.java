package com.cardinal.command.main;

import com.cardinal.command.command.GarageDoorOpenCommand;
import com.cardinal.command.command.LightOnCommand;
import com.cardinal.command.objects.GarageDoor;
import com.cardinal.command.objects.Light;
import com.cardinal.command.remote.SimpleRemoteControl;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Room");
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(new GarageDoorOpenCommand(garageDoor));
        remote.buttonWasPressed();
    }
}
