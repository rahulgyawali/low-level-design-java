package designpatterns.behavioral.command.with.command;

public interface ICommand {

    /**
     * Keeps track of the basic commands
     */
    public void execute();

    public void undo();
}
