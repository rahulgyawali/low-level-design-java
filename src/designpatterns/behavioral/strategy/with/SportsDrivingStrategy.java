package designpatterns.behavioral.strategy.with;

public class SportsDrivingStrategy implements DrivingStrategy{

    @Override
    public void drive(){
        System.out.println("Sports Driving Capability");
    }
}
