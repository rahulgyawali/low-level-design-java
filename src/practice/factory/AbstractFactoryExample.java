package practice.factory;

public class AbstractFactoryExample {

    public static abstract class Vehicle{
        public abstract void drive();
    }

    public static class VehicleTypeFactory{
        VehicleFactory vehicleFactory;
        public VehicleTypeFactory (String name){
            if(name.equals(LuxuryVehicleFactory.class.getSimpleName())){
                vehicleFactory = new LuxuryVehicleFactory();
            }else if(name.equals(OrdinaryVehicle.class.getSimpleName())){
                vehicleFactory = new OrdinaryVehicleFactory();
            }
        }
    }

    public static abstract class VehicleFactory{
        abstract Vehicle createVehicle(String name);
    }


    public static class LuxuryVehicleFactory extends VehicleFactory{
        Vehicle createVehicle(String name){
            Vehicle vehicle = null;
            if(name.equals(Audi.class.getSimpleName())){
                vehicle = new Audi();
            }else if(name.equals(BMW.class.getSimpleName())){
                vehicle = new BMW();
            }
            return vehicle;
        }
    }
    public static class OrdinaryVehicleFactory extends VehicleFactory{
        Vehicle createVehicle(String name){
            Vehicle vehicle = null;
            if(name.equals(Honda.class.getSimpleName())){
                vehicle = new Honda();
            }else if(name.equals(Toyota.class.getSimpleName())){
                vehicle = new Toyota();
            }
            return vehicle;
        }
    }

    public static abstract class LuxuryVehicle extends Vehicle{

    }

    public static abstract class OrdinaryVehicle extends Vehicle{

    }

    public static class BMW extends LuxuryVehicle{
        @Override
        public void drive(){
            System.out.println("Driving "+this.getClass().getSimpleName());
        }
    }

    public static class Audi extends LuxuryVehicle{
        @Override
        public void drive(){
            System.out.println("Driving "+this.getClass().getSimpleName());
        }
    }

    public static class Honda extends OrdinaryVehicle{
        @Override
        public void drive(){
            System.out.println("Driving "+this.getClass().getSimpleName());
        }
    }

    public static class Toyota extends OrdinaryVehicle{
        @Override
        public void drive(){
            System.out.println("Driving "+this.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        VehicleTypeFactory vehicleTypeFactory = new VehicleTypeFactory(LuxuryVehicleFactory.class.getSimpleName());
        VehicleFactory vehicleFactory = vehicleTypeFactory.vehicleFactory;
        Vehicle vehicle = vehicleFactory.createVehicle("Audi");
        vehicle.drive();
    }
}
