package practice.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingSpot> parkingSpots;

    ParkingLot(List<VehicleSize> spots){
        parkingSpots = new ArrayList<>();
        for(VehicleSize spot:spots){
            parkingSpots.add(new ParkingSpot(spot));
        }
    }

    
}
