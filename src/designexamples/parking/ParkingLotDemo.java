package designexamples.parking;

import java.util.ArrayList;
import java.util.List;

enum VehicleSize {
    SMALL,
    MEDIUM,
    LARGE
}

class Vehicle {
    private VehicleSize size;
    private String vehicleNumber; // Unique identifier for the vehicle

    public Vehicle(VehicleSize size, String vehicleNumber) {
        this.size = size;
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleSize getSize() {
        return size;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}

class ParkingSpot {
    private VehicleSize spotSize;
    private boolean occupied;
    private Vehicle parkedVehicle;

    public ParkingSpot(VehicleSize spotSize) {
        this.spotSize = spotSize;
        this.occupied = false;
        this.parkedVehicle = null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        // We only allow the vehicle if the spot is free and spot size >= vehicle size
        return !occupied && vehicle.getSize().ordinal() <= spotSize.ordinal();
    }

    public boolean park(Vehicle vehicle) {
        if (canFitVehicle(vehicle)) {
            parkedVehicle = vehicle;
            occupied = true;
            return true;
        }
        return false;
    }

    public void leave() {
        parkedVehicle = null;
        occupied = false;
    }

    public boolean isAvailable() {
        return !occupied;
    }

    public VehicleSize getSpotSize() {
        return spotSize;
    }

    public String getParkedVehicleNumber() {
        return (parkedVehicle != null) ? parkedVehicle.getVehicleNumber() : "None";
    }
}

class ParkingLot {
    private List<ParkingSpot> spots;

    public ParkingLot(List<VehicleSize> sizes) {
        spots = new ArrayList<>();
        for (VehicleSize size : sizes) {
            spots.add(new ParkingSpot(size));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.canFitVehicle(vehicle)) {
                spot.park(vehicle);
                System.out.println("Vehicle " + vehicle.getVehicleNumber()
                        + " parked in a " + spot.getSpotSize() + " spot.");
                return true;
            }
        }
        System.out.println("No suitable spot found for vehicle " + vehicle.getVehicleNumber() + ".");
        return false;
    }

    public void leaveSpot(int index) {
        if (index >= 0 && index < spots.size()) {
            ParkingSpot spot = spots.get(index);
            if (!spot.isAvailable()) {
                System.out.println("Vehicle " + spot.getParkedVehicleNumber()
                        + " has left spot " + index + ".");
                spot.leave();
            } else {
                System.out.println("Spot " + index + " is already free.");
            }
        } else {
            System.out.println("Invalid spot index.");
        }
    }

    public void displayStatus() {
        for (int i = 0; i < spots.size(); i++) {
            ParkingSpot spot = spots.get(i);
            String sizeText = spot.getSpotSize().toString();
            String statusText = spot.isAvailable()
                    ? "Available"
                    : "Occupied by Vehicle " + spot.getParkedVehicleNumber();
            System.out.println("Spot " + i + " (" + sizeText + ") - " + statusText);
        }
    }
}

public class ParkingLotDemo {
    public static void main(String[] args) {
        // Create a parking lot with a mix of spots
        List<VehicleSize> sizes = new ArrayList<>();
        sizes.add(VehicleSize.SMALL);
        sizes.add(VehicleSize.MEDIUM);
        sizes.add(VehicleSize.LARGE);
        sizes.add(VehicleSize.MEDIUM);
        sizes.add(VehicleSize.SMALL);

        ParkingLot lot = new ParkingLot(sizes);

        // Create vehicles
        Vehicle bike = new Vehicle(VehicleSize.SMALL, "BIKE123");
        Vehicle sedan = new Vehicle(VehicleSize.MEDIUM, "CAR456");
        Vehicle bus = new Vehicle(VehicleSize.LARGE, "BUS789");

        // Park vehicles
        lot.parkVehicle(bike);   // Should park in a SMALL spot
        lot.parkVehicle(sedan);  // Should park in a MEDIUM spot
        lot.parkVehicle(bus);    // Should park in a LARGE spot

        // Display parking lot status
        System.out.println("\nParking lot status:");
        lot.displayStatus();

        // Leave a spot
        lot.leaveSpot(2);

        // Display parking lot status again
        System.out.println("\nParking lot status after leaving a spot:");
        lot.displayStatus();
    }
}
