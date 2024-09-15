package designexamples.parkinglot;

public class ThreeWheelerParkingSpot extends ParkingSpot{

    ThreeWheelerParkingSpot(Vehicle vehicle){
        super(vehicle);
    }

    int price(){
        return 20;
    }
}
