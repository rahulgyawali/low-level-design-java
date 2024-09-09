package designpatterns.behavioral.command.with.client;

import designpatterns.behavioral.command.with.command.TurnOnAcCommand;
import designpatterns.behavioral.command.with.invoker.RemoteControl;
import designpatterns.behavioral.command.with.receiver.AirConditioner;

public class Client {

    public static void main(String[] args) {

        AirConditioner conditioner = new AirConditioner();

        RemoteControl remoteControl = new RemoteControl();


        remoteControl.setCommand(new TurnOnAcCommand(conditioner));

        remoteControl.pressButton();

        remoteControl.undo();

    }

}
