package practice.strategy;

public class FourWheelDrive implements IDrivingStrategy{
    @Override
    public void drive(){
        System.out.println("<<< Driving Four WD >>>");
    }
}
