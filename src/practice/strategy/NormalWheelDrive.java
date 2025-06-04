package practice.strategy;

public class NormalWheelDrive implements IDrivingStrategy{
    @Override
    public void drive(){
        System.out.println("--- Driving Normal Wheel ---");
    }
}
