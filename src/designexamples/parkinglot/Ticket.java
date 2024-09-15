package designexamples.parkinglot;

public class Ticket {

    long entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public long getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
