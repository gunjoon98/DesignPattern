package patterns.command;

public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        for(int idx = 0; idx < 7; idx++){
            onCommands[idx] = new NoCommand();
            offCommands[idx] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setOnCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n-------- 리모컨 --------\n");
        for(int i=0; i<7; i++) {
            sb.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("   ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return sb.toString();
    }
}
