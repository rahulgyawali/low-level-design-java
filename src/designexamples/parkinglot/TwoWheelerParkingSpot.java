package designexamples.parkinglot;

public class TwoWheelerParkingSpot extends ParkingSpot{

    TwoWheelerParkingSpot(Vehicle vehicle){
        super(vehicle);
    }

    int price(){
        return 10;
    }
}
