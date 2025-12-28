package command;

import patterns.command.*;

public class commendTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        Stereo stereo = new Stereo();
        Command SteroOnCommand = new SteroOnCommand(stereo);
        Command SteroOffCommand = new SteroOffCommand(stereo);

        remoteControl.setOnCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setOnCommand(1, SteroOnCommand, SteroOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);
    }
}
