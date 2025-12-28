package patterns.command;

public class Stereo {
    private int volume;
    private boolean autoPlayCd;

    public void on() {
        System.out.println("Stereo On");
    }

    public void off() {
        System.out.println("Stereo Off");
    }

    public void setAutoPlayCd(boolean autoPlayCd) {
        this.autoPlayCd = autoPlayCd;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
