package command;

import patterns.command.*;

public class macroCommandTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        SteroOnCommand steroOnCommand = new SteroOnCommand(stereo);
        SteroOffCommand steroOffCommand = new SteroOffCommand(stereo);
        CeilingFanHighCommand cailingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command[] commands1 = new Command[] {lightOnCommand, steroOnCommand, cailingFanHighCommand};
        Command[] commands2 = new  Command[] {lightOffCommand, steroOffCommand};
        MacroCommand macroCommand = new MacroCommand(commands1);
        MacroCommand macroCommand2 = new MacroCommand(commands2);

        remoteControl.setOnCommand(0, macroCommand, macroCommand2);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
