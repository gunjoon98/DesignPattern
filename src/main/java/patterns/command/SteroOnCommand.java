package patterns.command;

public class SteroOnCommand implements Command {
    private final Stereo stereo;

    public SteroOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setAutoPlayCd(true);
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
