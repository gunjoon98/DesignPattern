package patterns.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("no execute");
    }

    @Override
    public void undo() {
        System.out.println("no execute");
    }
}
