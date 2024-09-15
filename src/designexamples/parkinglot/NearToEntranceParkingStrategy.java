package designexamples.parkinglot;

public class NearToEntranceParkingStrategy implements ParkingStrategy{

    @Override
    public ParkingSpot find(Vehicle vehicle){
        return new ParkingSpot(vehicle);
    }
}
