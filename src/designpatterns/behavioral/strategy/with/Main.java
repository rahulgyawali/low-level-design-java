package designpatterns.behavioral.strategy.with;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(new NormalDrivingStrategy());
        vehicle.drive();
    }
}
