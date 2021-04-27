package designpattern.command;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for(int i=0;i<5;i++){
            Command onCommand = new NoCommand();
            Command offCommand = new NoCommand();

            onCommands[i] = onCommand;
            offCommands[i] = offCommand;
        }

    }


    public void setPositionCommand(int position,Command onCommand,Command offCommand){
        onCommands[position] = onCommand;
        offCommands[position] = offCommand;
    }

    public void onClickButtonOn(int position){
        onCommands[position].execute();
        undoCommand = onCommands[position];
    }

    public void onClickButtonOff(int position){
        offCommands[position].execute();
        undoCommand = offCommands[position];
    }

    public void onClickButtonUndo(){
        if(undoCommand!=null){
            undoCommand.undo();
        }

    }
}
