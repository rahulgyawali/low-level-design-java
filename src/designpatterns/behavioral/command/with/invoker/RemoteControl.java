package designpatterns.behavioral.command.with.invoker;

import designpatterns.behavioral.command.with.command.ICommand;

import java.util.Stack;

public class RemoteControl {

    ICommand command;
    Stack<ICommand> commandHistory = new Stack<>();

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
        commandHistory.push(command);
    }

    public void undo(){
        if(!commandHistory.isEmpty()){
            ICommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }

}
