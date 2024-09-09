package designpatterns.behavioral.strategy.with;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SportsDrivingStrategy());
    }
}
