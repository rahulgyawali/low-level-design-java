package designpatterns.behavioral.command.with.command;

import designpatterns.behavioral.command.with.receiver.AirConditioner;

public class TurnOffAcCommand implements ICommand{

    AirConditioner airConditioner;

    TurnOffAcCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute(){
        airConditioner.turnOffAC();
    }

    @Override
    public void undo(){
        airConditioner.turnOnAC();
    }
}
