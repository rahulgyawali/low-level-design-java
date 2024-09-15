package designexamples.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    ParkingStrategy parkingStrategy;

    ParkingSpotManager(){
        this.parkingSpotList = new ArrayList<>();
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpotList.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot){
        //
    }

    public void addVehicle(Vehicle vehicle){
        ParkingSpot parkingSpot = parkingStrategy.find(vehicle);
    }

    public void removeVehicle(){

    }


}
