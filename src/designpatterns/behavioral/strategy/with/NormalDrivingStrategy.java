package designpatterns.behavioral.strategy.with;

public class NormalDrivingStrategy implements DrivingStrategy{
    @Override
    public void drive(){
        System.out.println("Normal Driving Capability");
    }
}
