package practice.strategy;

public class SportsWheelDrive implements IDrivingStrategy{
    @Override
    public void drive() {
        System.out.println("*** Driving Sports Wheel ***");
    }
}
