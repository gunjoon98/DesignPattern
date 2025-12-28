package patterns.command;

public class SteroOffCommand implements Command {
    private final Stereo stereo;

    public SteroOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
