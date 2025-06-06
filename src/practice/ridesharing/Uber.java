package practice.ridesharing;

public class Uber {

    public static void main(String[] args) {

        DriverManager driverManager = DriverManager.getDriverManager();
        RiderManager riderManager = RiderManager.riderManager();

        //Add Rider
        Rider rider1 = new Rider(1,4.0);
        Rider rider2 = new Rider(2,3.0);
        riderManager.addRider(1,rider1);
        riderManager.addRider(2,rider2);

        //Add Driver
        Driver driver1 = new Driver(5.0,1);
        Driver driver2 = new Driver(5.0,2);
        driverManager.addRider(1,driver1);
        driverManager.addRider(2,driver2);

        //Set Location
        Location start = new Location(100,120);
        Location end = new Location(234,472);

        //Create Trip
        TripManager tripManager = TripManager.getTripManager();
        tripManager.createTrip(rider1,start,end);
        tripManager.createTrip(rider2,start,end);
        tripManager.showTrips();
    }
}
