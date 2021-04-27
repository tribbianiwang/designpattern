package designpattern.command;

public class Test {
    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();

        Command lightOnCommand = new LightonCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setPositionCommand(0,lightOnCommand,lightOffCommand);
        remoteController.onClickButtonOn(0);
        remoteController.onClickButtonUndo();

        remoteController.onClickButtonOff(0);
        remoteController.onClickButtonUndo();

    }
}
