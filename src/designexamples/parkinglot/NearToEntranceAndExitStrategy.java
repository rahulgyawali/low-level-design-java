package designexamples.parkinglot;

public class NearToEntranceAndExitStrategy implements ParkingStrategy{

    @Override
    public ParkingSpot find(Vehicle vehicle){
        return new ParkingSpot(vehicle);
    }
}
