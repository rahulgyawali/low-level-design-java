package designpatterns.behavioral.strategy.with;

public class Vehicle {

    DrivingStrategy drivingStrategy;

    public Vehicle(DrivingStrategy strategy){
        drivingStrategy = strategy;
    }

    public void drive(){
        drivingStrategy.drive();
    }
}
