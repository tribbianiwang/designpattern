package designpattern.command;

public class LightonCommand implements Command{

    private LightReceiver lightReceiver;

    public LightonCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
