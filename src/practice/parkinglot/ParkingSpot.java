package practice.parkinglot;

public class ParkingSpot {
    VehicleSize spotSize;
    boolean occupied;
    Vehicle parkedVehicle;

    ParkingSpot(VehicleSize size){
        this.spotSize = size;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean canFit(Vehicle vehicle){
        return !occupied && vehicle.size.getSize() <= spotSize.getSize();
    }

    public boolean canPark(Vehicle vehicle){
        if(canFit(vehicle)){
            occupied = true;
            parkedVehicle = vehicle;
            return true;
        }
        return false;
    }

    public VehicleSize getSpotSize() {
        return spotSize;
    }

    public void setSpotSize(VehicleSize spotSize) {
        this.spotSize = spotSize;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }
}
