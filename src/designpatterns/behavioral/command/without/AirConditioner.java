package designpatterns.behavioral.command.without;

public class AirConditioner {

    boolean isOn;
    int temperature;

    public void turnOnAC(){
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOffAC(){
        isOn = false;
        System.out.println("AC is OFF");
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("The AC is set at temperature "+temperature);
    }

    /**
     * 1. Not much abstraction
     * 2. Undo/Redo Functionality
     *
     */

    /**
     * User Receiver, Command and Invoker way
     */



}
