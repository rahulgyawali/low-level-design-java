package practice.factory;

public class FactoryPatternExample {

    public static abstract class Vehicle{
        public abstract void drive();
    }

    public static class TwoWheeler extends Vehicle{
        public void drive(){
            System.out.println("Driving Two Wheeler");
        }
    }

    public static class FourWheeler extends Vehicle{
        public void drive(){
            System.out.println("Driving Four Wheeler");
        }
    }

    public static class VehicleFactory{
        Vehicle vehicle;
        public Vehicle createVehicle(String type){
            if(type.equals(TwoWheeler.class.getSimpleName())){
                vehicle = new TwoWheeler();
            }else if(type.equals(FourWheeler.class.getSimpleName())){
                vehicle = new FourWheeler();
            }
            return vehicle;
        }

    }

    public static void main(String[] args) {
            VehicleFactory vehicleFactory = new VehicleFactory();
            Vehicle vehicle = vehicleFactory.createVehicle(TwoWheeler.class.getSimpleName());
            vehicle.drive();
    }
}
