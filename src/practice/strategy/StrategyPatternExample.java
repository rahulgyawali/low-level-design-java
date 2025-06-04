package practice.strategy;

public class StrategyPatternExample {

    public static class Vehicle{
        IDrivingStrategy drivingStrategy;

        public void drive(){
            drivingStrategy.drive();
        }
        public void display(){
            System.out.println("### I am a "+this.getClass().getSimpleName()+" ###");
        }
    }

    public static class CommuterVehicle extends Vehicle{
        public CommuterVehicle(){
            drivingStrategy = new NormalWheelDrive();
        }
    }

    public static class OffRoadVehicle extends Vehicle{
        public OffRoadVehicle(){
            drivingStrategy = new FourWheelDrive();
        }
    }


    public static class SportsVehicle extends Vehicle{
        public SportsVehicle(){
            drivingStrategy = new SportsWheelDrive();
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new OffRoadVehicle();
        vehicle1.display();
        vehicle1.drive();

        Vehicle vehicle2 = new CommuterVehicle();
        vehicle2.display();
        vehicle2.drive();

        Vehicle vehicle3 = new SportsVehicle();
        vehicle3.display();
        vehicle3.drive();

    }
}
