package designexamples.parkinglot;

public class ParkingSpot {

    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    ParkingSpot(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    void removeVehicle(){
        this.vehicle = null;
        this.isEmpty = true;
    }
}
