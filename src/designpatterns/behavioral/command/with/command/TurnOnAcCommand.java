package designpatterns.behavioral.command.with.command;

import designpatterns.behavioral.command.with.receiver.AirConditioner;

public class TurnOnAcCommand implements ICommand{

    AirConditioner airConditioner;

    public TurnOnAcCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute(){
        airConditioner.turnOnAC();
    }

    @Override
    public void undo(){
        airConditioner.turnOffAC();
    }
}
