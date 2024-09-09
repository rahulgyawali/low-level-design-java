package designpatterns.behavioral.command.with.receiver;

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
}
